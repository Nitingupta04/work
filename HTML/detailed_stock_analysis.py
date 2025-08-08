import yfinance as yf
import pandas as pd
import matplotlib.pyplot as plt
import mplfinance as mpf
import numpy as np

# Function to compute Relative Strength Index (RSI)
def compute_rsi(series, window=14):
    delta = series.diff()
    gain = delta.clip(lower=0)
    loss = -delta.clip(upper=0)
    avg_gain = gain.rolling(window=window, min_periods=window).mean()
    avg_loss = loss.rolling(window=window, min_periods=window).mean()
    rs = avg_gain / avg_loss
    rsi = 100 - (100 / (1 + rs))
    return rsi

# Function to compute MACD and Signal Line
def compute_macd(series, span_short=12, span_long=26, signal_span=9):
    ema_short = series.ewm(span=span_short, adjust=False).mean()
    ema_long = series.ewm(span=span_long, adjust=False).mean()
    macd = ema_short - ema_long
    signal = macd.ewm(span=signal_span, adjust=False).mean()
    return macd, signal

def main():
    # --- Step 1: Dynamic user inputs ---
    stock_ticker = input("Enter the stock ticker (e.g., TCS.NS): ").strip()
    start_date = input("Enter the start date (YYYY-MM-DD): ").strip()
    end_date = input("Enter the end date (YYYY-MM-DD): ").strip()
    
    # --- Step 2: Fetch data using yfinance ---
    df = yf.download(stock_ticker, start=start_date, end=end_date)
    if df.empty:
        print(f"No data found for {stock_ticker}. Please check your ticker and date range.")
        return
    
    # --- Step 3: Calculate technical indicators ---
    df['50_MA'] = df['Close'].rolling(window=50).mean()
    df['20_MA'] = df['Close'].rolling(window=20).mean()
    
    # Bollinger Bands
    df['20_std'] = df['Close'].rolling(window=20).std()
    df['Upper_BB'] = df['20_MA'] + 2 * df['20_std']
    df['Lower_BB'] = df['20_MA'] - 2 * df['20_std']
    
    # RSI
    df['RSI'] = compute_rsi(df['Close'])
    
    # MACD
    df['MACD'], df['Signal'] = compute_macd(df['Close'])
    df['MACD_Hist'] = df['MACD'] - df['Signal']
    
    # Daily Returns
    df['Daily_Return'] = df['Close'].pct_change()
    
    # --- Step 4: Plotting all subplots ---
    fig, axs = plt.subplots(3, 2, figsize=(15, 12))

    # Plot 1: Price chart with Moving Averages
    axs[0, 0].plot(df.index, df['Close'], label='Close Price', color='blue')
    axs[0, 0].plot(df.index, df['50_MA'], label='50-day MA', color='red', linestyle='--')
    axs[0, 0].set_title("Price Chart with 50-day Moving Average")
    axs[0, 0].legend()
    axs[0, 0].grid(True)

    # Plot 2: Bollinger Bands
    axs[0, 1].plot(df.index, df['Close'], label='Close Price', color='blue')
    axs[0, 1].plot(df.index, df['20_MA'], label='20-day MA', color='orange', linestyle='--')
    axs[0, 1].plot(df.index, df['Upper_BB'], label='Upper Bollinger Band', color='green')
    axs[0, 1].plot(df.index, df['Lower_BB'], label='Lower Bollinger Band', color='red')
    axs[0, 1].fill_between(df.index, df['Upper_BB'], df['Lower_BB'], color='grey', alpha=0.3)
    axs[0, 1].set_title("Bollinger Bands")
    axs[0, 1].legend()
    axs[0, 1].grid(True)

    # Plot 3: RSI
    axs[1, 0].plot(df.index, df['RSI'], label='RSI', color='purple')
    axs[1, 0].axhline(70, color='red', linestyle='--', label='Overbought')
    axs[1, 0].axhline(30, color='green', linestyle='--', label='Oversold')
    axs[1, 0].set_title("Relative Strength Index (RSI)")
    axs[1, 0].legend()
    axs[1, 0].grid(True)

    # Plot 4: MACD
    axs[1, 1].plot(df.index, df['MACD'], label='MACD', color='blue')
    axs[1, 1].plot(df.index, df['Signal'], label='Signal Line', color='orange')
    axs[1, 1].bar(df.index, df['MACD_Hist'], label='MACD Histogram', color='grey', alpha=0.5)
    axs[1, 1].set_title("MACD")
    axs[1, 1].legend()
    axs[1, 1].grid(True)

    # Plot 5: Daily Returns Histogram
    axs[2, 0].hist(df['Daily_Return'].dropna(), bins=50, color='blue', edgecolor='black', alpha=0.7)
    axs[2, 0].set_title("Daily Returns Histogram")
    axs[2, 0].set_xlabel("Daily Return")
    axs[2, 0].set_ylabel("Frequency")
    axs[2, 0].grid(True)

    # Adjust layout
    plt.tight_layout()
    plt.show()

    # Plot 6: Candlestick Chart using mplfinance
    mpf.plot(df, type='candle', style='charles', volume=True,
             title=f"{stock_ticker} Candlestick Chart",
             mav=(20, 50), figratio=(12, 6))

if __name__ == "__main__":
    main()