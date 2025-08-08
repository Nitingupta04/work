import yfinance as yf
import pandas as pd
import matplotlib.pyplot as plt

# Function to compute Relative Strength Index (RSI)
def compute_rsi(data, window=14):
    delta = data.diff()
    gain = delta.where(delta > 0, 0)
    loss = -delta.where(delta < 0, 0)
    avg_gain = gain.rolling(window=window, min_periods=window).mean()
    avg_loss = loss.rolling(window=window, min_periods=window).mean()
    rs = avg_gain / avg_loss
    rsi = 100 - (100 / (1 + rs))
    return rsi

# Function to compute MACD and Signal Line
def compute_macd(data, span_short=12, span_long=26, signal_span=9):
    ema_short = data.ewm(span=span_short, adjust=False).mean()
    ema_long = data.ewm(span=span_long, adjust=False).mean()
    macd = ema_short - ema_long
    signal = macd.ewm(span=signal_span, adjust=False).mean()
    return macd, signal

def main():
    # --- Step 1: Get user input for dynamic analysis ---
    stock_ticker = input("Enter the stock ticker (e.g., TCS.NS): ").strip()
    start_date = input("Enter the start date (YYYY-MM-DD): ").strip()
    end_date = input("Enter the end date (YYYY-MM-DD): ").strip()
    
    # --- Step 2: Fetch stock data using yfinance ---
    df = yf.download(stock_ticker, start=start_date, end=end_date)
    if df.empty:
        print(f"No data found for {stock_ticker}. Please check the ticker and date range.")
        return
    
    # --- Step 3: Calculate additional technical indicators ---
    # 50-day Moving Average for the closing price
    df['50_MA'] = df['Close'].rolling(window=50).mean()
    
    # Compute RSI
    df['RSI'] = compute_rsi(df['Close'])
    
    # Compute MACD and its Signal Line
    df['MACD'], df['Signal'] = compute_macd(df['Close'])
    df['MACD_Hist'] = df['MACD'] - df['Signal']
    
    # --- Step 4: Plot the technical analysis charts ---
    plt.figure(figsize=(14, 12))
    
    # Subplot 1: Price Chart with 50-day Moving Average
    ax1 = plt.subplot(3, 1, 1)
    ax1.plot(df.index, df['Close'], label='Close Price', color='blue')
    ax1.plot(df.index, df['50_MA'], label='50-day MA', color='red', linestyle='--')
    ax1.set_title(f"{stock_ticker} Price Chart")
    ax1.set_ylabel("Price (INR)")
    ax1.legend()
    ax1.grid(True)
    
    # Subplot 2: Relative Strength Index (RSI)
    ax2 = plt.subplot(3, 1, 2)
    ax2.plot(df.index, df['RSI'], label='RSI', color='purple')
    ax2.axhline(70, color='red', linestyle='--', label='Overbought (70)')
    ax2.axhline(30, color='green', linestyle='--', label='Oversold (30)')
    ax2.set_title("Relative Strength Index (RSI)")
    ax2.set_ylabel("RSI")
    ax2.legend()
    ax2.grid(True)
    
    # Subplot 3: MACD and Signal Line with Histogram
    ax3 = plt.subplot(3, 1, 3)
    ax3.plot(df.index, df['MACD'], label='MACD', color='blue')
    ax3.plot(df.index, df['Signal'], label='Signal Line', color='orange')
    ax3.bar(df.index, df['MACD_Hist'], label='Histogram', color='grey', alpha=0.3)
    ax3.set_title("MACD")
    ax3.set_ylabel("MACD")
    ax3.legend()
    ax3.grid(True)
    
    plt.tight_layout()
    plt.show()
    
    # Plotting Volume in a separate figure
    plt.figure(figsize=(14, 4))
    plt.bar(df.index, df['Volume'], color='green', alpha=0.5)
    plt.title(f"{stock_ticker} Trading Volume")
    plt.xlabel("Date")
    plt.ylabel("Volume")
    plt.grid(True)
    plt.show()

if __name__ == '__main__':
    main()
