
# 🧩 Insert POsition
You are given a sorted array (numbers are in increasing order), and a target number.

### 👉 Your job is to:

Return the index if the target is found in the array.

If the target is not found, return the index where it should be inserted to keep the array sorted.

### 🧠 Examples:
Example 1:
```
nums = [1, 3, 5, 6], target = 5
✅ Target is present → Return index 2.
```
Example 2:
```
nums = [1, 3, 5, 6], target = 2
❌ Target not present. It should be inserted at index 1 → so return 1.
```
Example 3:
```
nums = [1, 3, 5, 6], target = 7
❌ Target is bigger than all elements → Insert at end → Return 4.
```

#### 🚶 Simple Idea:

- Go through each number from left to right:

  - If you find the number → return its position.

  - If the number is greater than the target → the target should go before it → return that position.

  - If you reach the end and still didn’t find a bigger number → target should go at the end.

