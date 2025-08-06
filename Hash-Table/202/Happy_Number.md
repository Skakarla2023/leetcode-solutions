# 💡 202 Happy Number

- A happy number is a number defined by the following process:

- Starting with any positive integer, replace the number by the sum of the squares of its digits.

- Repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle that does not include 1.

- If it ends in 1, it’s a happy number. Otherwise, it’s not happy.


### 🔢 Example:

Let’s take n = 19:

```vbnet
Step 1: 1² + 9² = 1 + 81 = 82
Step 2: 8² + 2² = 64 + 4 = 68
Step 3: 6² + 8² = 36 + 64 = 100
Step 4: 1² + 0² + 0² = 1 → ✅ Happy Number
```
