# 🧠 1984. Minimum Difference Between Highest and Lowest of K Scores

You are given a list of students’ scores and a number k.

- You need to:

  - Pick any group of k students.
  - Find the highest score and lowest score in that group.
  - Calculate the difference between those scores.
  - Among all possible groups, return the smallest such difference.

### 📝 Example:

- Input:

```
scores = [9, 4, 1, 7], k = 2
```

#### Step 1: Sort the scores:

```
[1, 4, 7, 9]
```

#### Step 2: Find all groups of k=2 students and their differences:

Group [1, 4] → 4 - 1 = 3

Group [4, 7] → 7 - 4 = 3

Group [7, 9] → 9 - 7 = 2 ✅

Output: 2 (this is the minimum difference)



### ✅ Solution Trick:

Sort the array

Look at each sliding window of size k

In each window, calculate: max - min = nums[i + k - 1] - nums[i]

Take the minimum among all those differences
