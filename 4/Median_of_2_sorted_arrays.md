# 🧠 Median of 2 sorted arrays

You are given two sorted arrays (they are already in increasing order).
Your job is to combine them and find the median.

### 💡 What is a median?

If you arrange numbers in increasing order:

- If there's odd number of elements → the middle number is the median.

- If there's an even number of elements → take the average of the two middle numbers.

### Example:

[1, 3, 4] → median = 3

[1, 3, 4, 6] → median = (3+4)/2 = 3.5

## 📦 Example:

```java
nums1 = [1, 3]
nums2 = [2]
Combine: [1, 2, 3]
```

Median is the middle value → 2

```java
nums1 = [1, 2]
nums2 = [3, 4]
Combine: [1, 2, 3, 4]
```

Median = (2 + 3)/2 = 2.5

