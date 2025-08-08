import matplotlib.pyplot as plt
import numpy as np

# Calculate total sales and profit
total_sales = orders_df["Sales"].sum()
total_profit = orders_df["Profit"].sum()

# Sales & Profit by Region
sales_by_region = orders_df.groupby("Region")["Sales"].sum().sort_values(ascending=False)
profit_by_region = orders_df.groupby("Region")["Profit"].sum().sort_values(ascending=False)

# Top 10 Products by Sales
top_products = orders_df.groupby("Product Name")["Sales"].sum().sort_values(ascending=False).head(10)

# Set figure size
fig, axes = plt.subplots(1, 3, figsize=(18, 5))

# Sales by Region
axes[0].bar(sales_by_region.index, sales_by_region.values, color="blue", alpha=0.7)
axes[0].set_title("Total Sales by Region")
axes[0].set_ylabel("Sales ($)")
axes[0].set_xlabel("Region")
axes[0].tick_params(axis='x', rotation=45)

# Profit by Region
axes[1].bar(profit_by_region.index, profit_by_region.values, color="green", alpha=0.7)
axes[1].set_title("Total Profit by Region")
axes[1].set_ylabel("Profit ($)")
axes[1].set_xlabel("Region")
axes[1].tick_params(axis='x', rotation=45)

# Top 10 Products by Sales
y_pos = np.arange(len(top_products))
axes[2].barh(y_pos, top_products.values, color="orange", alpha=0.7)
axes[2].set_yticks(y_pos)
axes[2].set_yticklabels(top_products.index)
axes[2].invert_yaxis()  # Highest sales at the top
axes[2].set_title("Top 10 Products by Sales")
axes[2].set_xlabel("Sales ($)")
axes[2].set_ylabel("Product Name")

# Adjust layout and display plots
plt.tight_layout()
plt.show()
