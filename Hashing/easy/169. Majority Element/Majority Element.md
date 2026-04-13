# 169. Majority Element

**Difficulty** :Easy

**Topic**: HashMap

---

## Problem Statement

Given an array `nums` of size `n`, return the **majority element**.

The majority element is the element that appears **more than ⌊n / 2⌋ times**.

You may assume that the majority element always exists in the array.

---

## Example

### Input
```java
nums = [3,2,3]
```

### Output
```java
3
```

---

### Input
```java
nums = [2,2,1,1,1,2,2]
```

### Output
```java
2
```

---

## Approach (Using HashMap)

### Idea

- Use a **HashMap** to store frequency of each element.
- Traverse the array:
  - Increment count of each number.
- Check which element has frequency greater than `n/2`.
- Return that element.

---

## Dry Run

For:

```java
nums = [2,2,1,1,1,2,2]
```

HashMap Frequency Count:

```java
2 -> 4
1 -> 3
```

Since:

```java
4 > 7/2
```

Answer:

```java
2
```

## Space Complexity

```java
O(n)
```

- In worst case, HashMap stores all unique elements.

---

## Key Concepts Used

- HashMap
- Frequency Counting
- Array Traversal

---

## Alternative Optimal Approach

There is a more optimal solution using **Boyer-Moore Voting Algorithm**:

- **Time:** `O(n)`
- **Space:** `O(1)`

But HashMap approach is easier to understand and good for beginners.

---

## What I Learned

- How to use HashMap for frequency counting.
- How to solve majority-based problems efficiently.
- Early return optimization while counting frequencies.

---
