import yfinance as yf
import pandas as pd
import matplotlib.pyplot as plt


# Download TCS stock data
tcs = yf.download("TCS.NS", start="2023-01-01", end="2024-01-01")

# Display the first few rows of the dataset
print(tcs.head())


# Plot Closing Prices
plt.figure(figsize=(12, 6))
plt.plot(tcs.index, tcs['Close'], label='TCS Closing Price', color='b')

# Add titles and labels
plt.title("TCS Stock Closing Price Trend (2023-2024)")
plt.xlabel("Date")
plt.ylabel("Closing Price (INR)")
plt.legend()
plt.grid(True)

# Show the plot
plt.show()


# Compute moving averages
tcs['50_MA'] = tcs['Close'].rolling(window=50).mean()

# Plot Closing Price and Moving Average
plt.figure(figsize=(12, 6))
plt.plot(tcs.index, tcs['Close'], label='TCS Closing Price', color='b')
plt.plot(tcs.index, tcs['50_MA'], label='50-day Moving Average', color='r', linestyle='dashed')

# Add titles and labels
plt.title("TCS Stock Closing Price & 50-Day Moving Average")
plt.xlabel("Date")
plt.ylabel("Price (INR)")
plt.legend()
plt.grid(True)

# Show the plot
plt.show()

# Plot Volume
plt.figure(figsize=(12, 6))
plt.bar(tcs.index, tcs['Volume'], color='g', alpha=0.5)

# Add titles and labels
plt.title("TCS Stock Trading Volume (2023-2024)")
plt.xlabel("Date")
plt.ylabel("Volume")
plt.grid(True)

# Show the plot
plt.show()
