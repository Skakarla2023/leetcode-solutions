# ✅ 448 – Find All Numbers Disappeared in an Array

## 📦 Problem:

- You're given an array nums of length n.
- It contains numbers between 1 and n.
- Some numbers may appear twice.
- Some numbers are missing.

### 🎯 Goal:
 
### 👉 Find all numbers between 1 and n that are missing from the array.

#### 🔍 Example:

```java
Input:  nums = [4, 3, 2, 7, 8, 2, 3, 1]
Length: n = 8
```

All numbers should be from 1 to 8, but we see:

- 2 and 3 are repeated

- 5 and 6 are missing

#### ✅ Output: [5, 6]

#### 👶 Real-Life Analogy:

- Imagine you have 8 roll numbers: 1 to 8.

- At attendance time, a few students say their number more than once, and some students don’t say it at all.

- Your job is to find out which roll numbers were never called.

🧠 Strategy (what we did in code):
Use each number in the array to mark that the number exists.

Mark by making the value at the matching index negative.

At the end, any positive value means the number (index + 1) was missing.
