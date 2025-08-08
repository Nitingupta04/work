import yfinance as yf
import matplotlib.pyplot as plt
import pandas as pd

# --- Step 1: Fetch 5 years of stock data ---
stock_ticker = input("Enter the stock ticker (e.g., TCS.NS, AAPL): ").strip()

# Define date range for 5 years
end_date = pd.Timestamp.today().date()
start_date = end_date - pd.DateOffset(years=5)

# Download stock data
df = yf.download(stock_ticker, start=start_date, end=end_date)

if df.empty:
    print(f"No data found for {stock_ticker}. Please check your ticker.")
    exit()

# --- Print Head ---
print(df.head())

# --- Step 2: Calculate Daily Returns ---
df['Daily_Return'] = df['Close'].pct_change()

# --- Step 3: Plot the Daily Returns ---

# Create a subplot with 2 plots (Time Series and Histogram)
fig, axes = plt.subplots(2, 1, figsize=(14, 10))

# --- 3.1: Daily Returns Time Series ---
axes[0].plot(df.index, df['Daily_Return'], label='Daily Return', color='blue', alpha=0.6)
axes[0].axhline(y=0, color='black', linestyle='--', linewidth=1)
axes[0].set_title(f"{stock_ticker} - Daily Returns (Time Series)")
axes[0].set_xlabel("Date")
axes[0].set_ylabel("Daily Return")
axes[0].legend()
axes[0].grid(True)

# --- 3.2: Daily Returns Histogram ---
axes[1].hist(df['Daily_Return'].dropna(), bins=50, color='blue', edgecolor='black', alpha=0.7)
axes[1].set_title(f"{stock_ticker} - Daily Returns Distribution (Histogram)")
axes[1].set_xlabel("Daily Return")
axes[1].set_ylabel("Frequency")
axes[1].grid(True)

# Show the plots
plt.tight_layout()
plt.show()
