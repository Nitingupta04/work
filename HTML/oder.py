import pandas as pd
import matplotlib.pyplot as plt
import seaborn as sns

# Load the Excel file from the provided path
file_path = r"C:\Users\nitin\New folder\orders.xlsx"
xls = pd.ExcelFile(file_path)

# Load the "Orders" sheet
df = pd.read_excel(xls, sheet_name="Orders")

# Convert 'Order Date' to datetime format and create a month-year column for aggregation
df['Order Date'] = pd.to_datetime(df['Order Date'])
df['OrderMonth'] = df['Order Date'].dt.to_period('M').astype(str)

# Calculate Profit Margin
df['Profit Margin'] = df['Profit'] / df['Sales']

# Set a Seaborn style for consistency
sns.set_theme(style="whitegrid")

# 1. Monthly Sales Trend (Time Series Analysis)
plt.figure(figsize=(12, 6))
monthly_sales = df.groupby('OrderMonth')['Sales'].sum().reset_index()
plt.plot(monthly_sales['OrderMonth'], monthly_sales['Sales'], marker='o', linestyle='-')
plt.xticks(rotation=45)
plt.xlabel("Order Month")
plt.ylabel("Total Sales")
plt.title("Monthly Sales Trend")
plt.tight_layout()
plt.show()

# 2. Correlation Heatmap: Key Numerical Metrics
plt.figure(figsize=(8, 6))
numeric_cols = ['Sales', 'Profit', 'Quantity', 'Discount', 'Profit Margin']
corr_matrix = df[numeric_cols].corr()
sns.heatmap(corr_matrix, annot=True, cmap='coolwarm', fmt=".2f")
plt.title("Correlation Heatmap")
plt.show()

# 3. Sales Distribution by Ship Mode (Box Plot)
plt.figure(figsize=(10, 6))
sns.boxplot(data=df, x='Ship Mode', y='Sales')
plt.xlabel("Ship Mode")
plt.ylabel("Sales")
plt.title("Sales Distribution by Ship Mode")
plt.show()

# 4. Discount vs Profit (Scatter Plot with Regression)
plt.figure(figsize=(8, 6))
sns.regplot(data=df, x='Discount', y='Profit', scatter_kws={'alpha': 0.5})
plt.xlabel("Discount")
plt.ylabel("Profit")
plt.title("Discount vs Profit")
plt.show()

# 5. Top 10 Sub-Categories by Sales (Bar Chart)
plt.figure(figsize=(12, 6))
subcat_sales = df.groupby('Sub-Category')['Sales'].sum().sort_values(ascending=False).head(10)
subcat_sales.plot(kind='bar', color='teal')
plt.xlabel("Sub-Category")
plt.ylabel("Total Sales")
plt.title("Top 10 Sub-Categories by Sales")
plt.xticks(rotation=45)
plt.tight_layout()
plt.show()

# --- Additional Graphs ---

# 6. Profit Margin Distribution by Category (Box Plot)
plt.figure(figsize=(10, 6))
sns.boxplot(data=df, x='Category', y='Profit Margin')
plt.xlabel("Category")
plt.ylabel("Profit Margin")
plt.title("Profit Margin Distribution by Category")
plt.show()

# 7. Discount Distribution (Histogram)
plt.figure(figsize=(8, 5))
sns.histplot(df["Discount"], bins=20, kde=True, color="skyblue")
plt.xlabel("Discount")
plt.ylabel("Frequency")
plt.title("Distribution of Discounts")
plt.show()

# 8. Order Count by Ship Mode (Count Plot)
plt.figure(figsize=(8, 5))
sns.countplot(data=df, x="Ship Mode", palette="Set2")
plt.xlabel("Ship Mode")
plt.ylabel("Number of Orders")
plt.title("Number of Orders by Ship Mode")
plt.show()

# 9. Sales vs Quantity Colored by Profit Margin (Scatter Plot)
plt.figure(figsize=(8, 5))
sc = plt.scatter(df["Sales"], df["Quantity"], c=df["Profit Margin"], cmap="viridis", alpha=0.7)
plt.xlabel("Sales")
plt.ylabel("Quantity")
plt.title("Sales vs Quantity Colored by Profit Margin")
plt.colorbar(sc, label="Profit Margin")
plt.show()

# 10. Monthly Average Profit Trend (Line Chart)
plt.figure(figsize=(12, 6))
monthly_profit = df.groupby('OrderMonth')['Profit'].mean().reset_index()
plt.plot(monthly_profit['OrderMonth'], monthly_profit['Profit'], marker='o', linestyle='-', color='red')
plt.xticks(rotation=45)
plt.xlabel("Order Month")
plt.ylabel("Average Profit")
plt.title("Monthly Average Profit Trend")
plt.tight_layout()
plt.show()
