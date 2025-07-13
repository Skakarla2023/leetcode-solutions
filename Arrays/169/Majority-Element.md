# 🟩 169 Majority Element 

Given: An array of n integers.
- Goal:
 Find the element that appears more than n / 2 times (i.e., it appears in the majority of the positions).

#### ✅ You are guaranteed that such an element always exists.

### 📌 Example:

```text
Input: [2, 2, 1, 1, 1, 2, 2]
Output: 2
```

### Explanation:

- Total elements = 7
- n/2 = 3.5 → So, majority means appearing more than 3 times
- '2' appears 4 times → So, it's the majority element.

### 🔍 What does "majority" mean?

In an array of n elements:

If any number appears more than n/2 times, it takes up the majority of the array.

Example:

n = 7 → majority means count > 3.5 → needs 4 or more times.

n = 10 → majority means >5 → needs 6 or more times.

### ⚙️ Boyer-Moore Voting Algorithm (Smart & Efficient)

#### 🧠 Intuition:

- This algorithm works like canceling votes:

  - Imagine every number is a candidate in an election.

  - The majority candidate will have more votes than all others combined.

  - You add votes for the majority and cancel out others, and still the majority survives.


### 🟢 Why is it Efficient?

- Time Complexity: O(n)

- Space Complexity: O(1) → No extra space used

- No map, no sorting, no brute force

