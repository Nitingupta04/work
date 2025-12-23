import yfinance as yf
import pandas as pd
import matplotlib.pyplot as plt
from datetime import datetime, timedelta

# List of popular stocks from different sectors
stocks = {
    'Technology': ['AAPL', 'MSFT', 'GOOGL', 'AMZN', 'TSLA'],
    'Finance': ['JPM', 'BAC', 'WFC', 'GS', 'MS'],
    'Healthcare': ['JNJ', 'PFE', 'UNH', 'ABBV', 'TMO'],
    'Consumer': ['KO', 'PG', 'WMT', 'HD', 'MCD'],
    'Energy': ['XOM', 'CVX', 'COP', 'EOG', 'SLB'],
    'Indian Stocks': ['TCS.NS', 'RELIANCE.NS', 'INFY.NS', 'HDFCBANK.NS', 'ICICIBANK.NS']
}

def analyze_stock(symbol, days=365):
    """Analyze a single stock and return key metrics"""
    try:
        # Download stock data
        stock = yf.download(symbol, start=(datetime.now() - timedelta(days=days)).strftime('%Y-%m-%d'), 
                           end=datetime.now().strftime('%Y-%m-%d'), progress=False)
        
        if stock.empty:
            return None
            
        # Calculate metrics
        current_price = stock['Close'].iloc[-1]
        start_price = stock['Close'].iloc[0]
        total_return = ((current_price - start_price) / start_price) * 100
        
        # Calculate volatility (standard deviation of daily returns)
        daily_returns = stock['Close'].pct_change().dropna()
        volatility = daily_returns.std() * 100
        
        # Calculate 50-day moving average
        ma_50 = stock['Close'].rolling(window=50).mean().iloc[-1]
        ma_trend = "Above MA50" if current_price > ma_50 else "Below MA50"
        
        # Volume analysis
        avg_volume = stock['Volume'].mean()
        recent_volume = stock['Volume'].tail(20).mean()
        volume_trend = "High" if recent_volume > avg_volume * 1.2 else "Normal"
        
        return {
            'symbol': symbol,
            'current_price': current_price,
            'total_return': total_return,
            'volatility': volatility,
            'ma_trend': ma_trend,
            'volume_trend': volume_trend,
            'avg_volume': avg_volume
        }
    except Exception as e:
        print(f"Error analyzing {symbol}: {e}")
        return None

def get_recommendations():
    """Get stock recommendations based on analysis"""
    print("🔍 Analyzing stocks from different sectors...\n")
    
    all_results = []
    
    for sector, symbols in stocks.items():
        print(f"📊 Analyzing {sector} stocks...")
        sector_results = []
        
        for symbol in symbols:
            result = analyze_stock(symbol)
            if result:
                sector_results.append(result)
                all_results.append(result)
        
        # Sort by total return for this sector
        sector_results.sort(key=lambda x: x['total_return'], reverse=True)
        
        if sector_results:
            print(f"   Top performer in {sector}: {sector_results[0]['symbol']} ({sector_results[0]['total_return']:.2f}%)")
    
    print("\n" + "="*60)
    print("🏆 TOP RECOMMENDATIONS")
    print("="*60)
    
    # Sort all results by total return
    all_results.sort(key=lambda x: x['total_return'], reverse=True)
    
    print("\n📈 HIGHEST RETURNS:")
    for i, stock in enumerate(all_results[:5], 1):
        print(f"{i}. {stock['symbol']}: {stock['total_return']:.2f}% (₹{stock['current_price']:.2f})")
    
    # Find low volatility stocks
    low_vol_stocks = sorted(all_results, key=lambda x: x['volatility'])[:5]
    print("\n🛡️ LOW VOLATILITY STOCKS:")
    for i, stock in enumerate(low_vol_stocks, 1):
        print(f"{i}. {stock['symbol']}: {stock['volatility']:.2f}% volatility")
    
    # Find stocks above 50-day MA
    above_ma_stocks = [s for s in all_results if s['ma_trend'] == "Above MA50"]
    if above_ma_stocks:
        print("\n📊 STOCKS ABOVE 50-DAY MOVING AVERAGE:")
        for i, stock in enumerate(above_ma_stocks[:5], 1):
            print(f"{i}. {stock['symbol']}: ₹{stock['current_price']:.2f}")
    
    return all_results

def plot_top_performers(results, top_n=5):
    """Plot the top performing stocks"""
    top_stocks = results[:top_n]
    
    plt.figure(figsize=(12, 8))
    
    # Create subplots
    fig, (ax1, ax2) = plt.subplots(2, 1, figsize=(12, 10))
    
    # Plot 1: Returns
    symbols = [stock['symbol'] for stock in top_stocks]
    returns = [stock['total_return'] for stock in top_stocks]
    
    bars1 = ax1.bar(symbols, returns, color=['green' if r > 0 else 'red' for r in returns])
    ax1.set_title('Top 5 Stocks by Total Return (%)')
    ax1.set_ylabel('Return (%)')
    ax1.grid(True, alpha=0.3)
    
    # Add value labels on bars
    for bar, return_val in zip(bars1, returns):
        height = bar.get_height()
        ax1.text(bar.get_x() + bar.get_width()/2., height,
                f'{return_val:.1f}%', ha='center', va='bottom' if height > 0 else 'top')
    
    # Plot 2: Volatility
    volatilities = [stock['volatility'] for stock in top_stocks]
    bars2 = ax2.bar(symbols, volatilities, color='orange', alpha=0.7)
    ax2.set_title('Volatility of Top 5 Stocks (%)')
    ax2.set_ylabel('Volatility (%)')
    ax2.grid(True, alpha=0.3)
    
    # Add value labels on bars
    for bar, vol in zip(bars2, volatilities):
        height = bar.get_height()
        ax2.text(bar.get_x() + bar.get_width()/2., height,
                f'{vol:.1f}%', ha='center', va='bottom')
    
    plt.tight_layout()
    plt.show()

if __name__ == "__main__":
    # Get recommendations
    results = get_recommendations()
    
    # Plot top performers
    if results:
        plot_top_performers(results)
        
        print("\n" + "="*60)
        print("💡 INVESTMENT TIPS:")
        print("="*60)
        print("• Consider stocks with high returns AND low volatility")
        print("• Stocks above 50-day MA often show positive momentum")
        print("• Diversify across different sectors")
        print("• Always do your own research before investing")
        print("• Past performance doesn't guarantee future results")
