# 🧩 Merge Sorted Array - Simple Explanation



You are given two **sorted arrays**:

- `nums1`, of size `m + n`, where:
  - First `m` elements are valid
  - Remaining `n` elements are `0`s and meant to hold elements of `nums2`
- `nums2`, a sorted array of `n` elements

📌 Your task: **Merge `nums2` into `nums1` in-place**, so that `nums1` becomes a single **sorted array**.

---

## 💡 Example

```java
Input:
nums1 = [1,2,3,0,0,0], m = 3
nums2 = [2,5,6],       n = 3
```

Output:
```
nums1 = [1,2,2,3,5,6]
```

### 🧠 Simple Explanation

1. You already have extra space in nums1 to fit all values from nums2.
2. Since both arrays are sorted, merge from the end to avoid overwriting data.
3. Compare the last elements of the valid parts of nums1 and nums2.
4. Place the bigger one at the end of nums1, and move pointers backward.
5. If anything is left in nums2, copy it into nums1.

