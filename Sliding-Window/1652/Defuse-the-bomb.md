# 🔒 1652 Defuse the Bomb

You are given a circular array code and an integer k.

You have to replace every number in the array with the sum of some other numbers around it, based on k.

### ✅ Rules:

- If k > 0:
  - Replace each number with the sum of the next k numbers.

- If k < 0:
  - Replace each number with the sum of the previous k numbers.

- If k == 0:
  - Replace every number with 0.

#### ⚠️ The array is circular — after the last element, it wraps back to the start.

### 🧠 Think Like This:

- Imagine the array is a circle. For each position:

- If k > 0, move clockwise and add the next k numbers.

- If k < 0, move counter-clockwise and add the previous k numbers.

- If k == 0, just write 0.

### 📦 Example:

Let’s take:

```
code = [5, 7, 1, 4]
k = 2
```
We replace each element like this:

For index 0 (5): next 2 = 7 + 1 = 8

For index 1 (7): next 2 = 1 + 4 = 5

For index 2 (1): next 2 = 4 + 5 = 9

For index 3 (4): next 2 = 5 + 7 = 12

#### ✅ Output: [8, 5, 9, 12]

If k = -2, you do previous 2 instead:

For index 0 (5): prev 2 = 4 + 1 = 5

For index 1 (7): prev 2 = 5 + 4 = 9

For index 2 (1): prev 2 = 7 + 5 = 12

For index 3 (4): prev 2 = 1 + 7 = 8

#### ✅ Output: [5, 9, 12, 8]

### ✨ Summary:

It’s like looking around in a circle, and adding the numbers before or after depending on k.

You don’t include the current number itself in the sum.

Use modulus % to wrap around the array when moving left or right.

