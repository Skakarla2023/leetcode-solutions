# 🛍️ Buy and Sell Stock

Imagine you’re looking at the prices of a stock over a few days.
You want to buy the stock on one day, and then sell it later to make the most money.

- But there are some rules:

  - You can only buy once and sell once.
  - You must buy before you sell (you can’t sell before buying).

## 🧠 What You Want:

- Find the lowest price to buy.

- After that, find the highest price to sell.

- The difference between them is your profit.

- Your goal is to get the maximum profit possible.

### 📊 Example

Suppose the prices over 6 days are:

```java
[7, 1, 5, 3, 6, 4]
```
- Let’s look at what happens:

```
You could buy at ₹1 (the lowest price).

Then sell at ₹6 (the highest after ₹1).

So your profit is: 6 - 1 = ₹5
```

That’s the best you can do, so the answer is 5.

### 🧃 Even Simpler:

Think of it like this:

- You're finding the best day to buy cheap, then the best day later to sell high.

- Just go through the list, keep track of the lowest price seen so far, and each day check:

### "If I sell today, how much profit do I make?"

### ❗ If the price keeps going down?

If prices are like:

```java
[5, 4, 3, 2, 1]
```

There’s no way to make money, so the answer is:

```
0
```
