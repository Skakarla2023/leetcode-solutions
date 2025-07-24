# 🧠 643 Maximum Average SubArray I

- You are given:

  - An array of integers nums[]
  - An integer k

- Your task is to:

  - Find the maximum average of any contiguous subarray of length k.


### 📌 Example:

```java
Input: nums = [1,12,-5,-6,50,3], k = 4
Let’s check all subarrays of size 4:

[1, 12, -5, -6] → sum = 2 → average = 0.5

[12, -5, -6, 50] → sum = 51 → average = 12.75 ✅

[-5, -6, 50, 3] → sum = 42 → average = 10.5
```

Answer: 12.75 is the maximum average.

## 🔍 Approach (Sliding Window):

- Instead of calculating the sum from scratch for every subarray (which is slow), we use the sliding window technique:

  - First, calculate the sum of the first k elements.

  - Then slide the window forward by:

  - Subtracting the element going out, and

  - Adding the new element coming in.

  - Keep track of the maximum sum seen so far.
