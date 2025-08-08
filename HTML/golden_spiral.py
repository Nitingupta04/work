import matplotlib.pyplot as plt
import numpy as np

def fibonacci_iterative(n):
    fib_series = [0, 1]  # Starting values
    for i in range(2, n):
        fib_series.append(fib_series[-1] + fib_series[-2])
    return fib_series[:n]

# User input
num = int(input("Enter the number of terms: "))
fib_series = fibonacci_iterative(num)

# X-axis values (Index of Fibonacci Numbers)
x_values = list(range(num))

# Creating a figure with subplots
plt.figure(figsize=(14, 8))

# 📈 **1. Line Chart**
plt.subplot(2, 3, 1)
plt.plot(x_values, fib_series, marker='o', linestyle='-', color='b', label="Fibonacci Sequence")
plt.xlabel("Index")
plt.ylabel("Fibonacci Number")
plt.title("Line Chart")
plt.legend()
plt.grid(True)

# 📊 **2. Bar Chart**
plt.subplot(2, 3, 2)
plt.bar(x_values, fib_series, color='g', label="Fibonacci Numbers")
plt.xlabel("Index")
plt.ylabel("Fibonacci Number")
plt.title("Bar Chart")
plt.legend()
plt.grid(axis='y')

# ⚫ **3. Scatter Plot**
plt.subplot(2, 3, 3)
plt.scatter(x_values, fib_series, color='r', label="Fibonacci Points")
plt.xlabel("Index")
plt.ylabel("Fibonacci Number")
plt.title("Scatter Plot")
plt.legend()
plt.grid(True)

# 🪜 **4. Step Chart**
plt.subplot(2, 3, 4)
plt.step(x_values, fib_series, color='purple', label="Fibonacci Steps", where='mid')
plt.xlabel("Index")
plt.ylabel("Fibonacci Number")
plt.title("Step Chart")
plt.legend()
plt.grid(True)

# 🔢 **5. Logarithmic Plot**
plt.subplot(2, 3, 5)
plt.plot(x_values, np.log1p(fib_series), marker='s', linestyle='-', color='orange', label="Log(Fibonacci)")
plt.xlabel("Index")
plt.ylabel("Log of Fibonacci Number")
plt.title("Logarithmic Plot")
plt.legend()
plt.grid(True)

# Adjust layout and show all plots
plt.tight_layout()
plt.show()
