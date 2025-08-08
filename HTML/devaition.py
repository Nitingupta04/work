import yfinance as yf
import pandas as pd
import matplotlib.pyplot as plt
from datetime import datetime, timedelta

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
    # --- Step 1: Get user input for stock ticker ---
    stock_ticker = input("Enter the stock ticker (e.g., TCS.NS): ").strip()
    
    # --- Step 2: Set the date range for 5 years ---
    end_date = datetime.today().strftime('%Y-%m-%d')  # Today's date
    start_date = (datetime.today() - timedelta(days=5*365)).strftime('%Y-%m-%d')  # 5 years ago
    
    print(f"Fetching data for {stock_ticker} from {start_date} to {end_date}...")

    # --- Step 3: Fetch stock data ---
    df = yf.download(stock_ticker, start=start_date, end=end_date)
    if df.empty:
        print(f"No data found for {stock_ticker}. Please check the ticker.")
        return

    # --- Step 4: Calculate technical indicators ---
    df['50_MA'] = df['Close'].rolling(window=50).mean()
    df['RSI'] = compute_rsi(df['Close'])
    df['MACD'], df['Signal'] = compute_macd(df['Close'])
    df['MACD_Hist'] = df['MACD'] - df['Signal']

    # --- Step 5: Calculate Daily Returns and Monthly Standard Deviation ---
    df['Daily_Return'] = df['Close'].pct_change()
    df['Month'] = df.index.to_period('M')  # Convert index to Monthly period
    monthly_std = df.groupby('Month')['Daily_Return'].std()  # Standard deviation per month

    # --- Step 6: Plot the technical analysis charts ---
    plt.figure(figsize=(14, 12))

    # Subplot 1: Price Chart with 50-day Moving Average
    ax1 = plt.subplot(3, 1, 1)
    ax1.plot(df.index, df['Close'], label='Close Price', color='blue')
    ax1.plot(df.index, df['50_MA'], label='50-day MA', color='red', linestyle='--')
    ax1.set_title(f"{stock_ticker} Price Chart (5 Years)")
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

    # --- Step 7: Plot Monthly Standard Deviation ---
    plt.figure(figsize=(14, 5))
    monthly_std.plot(kind='bar', color='blue', alpha=0.7)
    plt.title(f"Monthly Standard Deviation of Daily Returns ({stock_ticker}) - 5 Years")
    plt.xlabel("Month")
    plt.ylabel("Standard Deviation")
    plt.grid(axis='y', linestyle='--', alpha=0.6)
    plt.xticks(rotation=45)
    plt.show()

if __name__ == '__main__':
    main()
