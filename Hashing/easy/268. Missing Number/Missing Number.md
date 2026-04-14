# 268. Missing Number

**Difficulty:** Easy  
**Topic:** Array, Math

## Problem
Given an array `nums` containing `n` distinct numbers in the range `[0, n]`, return the missing number.

## Example
```java
Input: nums = [3,0,1]
Output: 2
```

---

## Approach 1: HashSet

Store all elements in a HashSet, then check from `0` to `n` which number is missing.

```java
import java.util.*;

class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        for (int i = 0; i <= n; i++) {
            if (!set.contains(i)) return i;
        }

        return 0;
    }
}
```

**Time:** `O(n)`  
**Space:** `O(n)`

---

## Approach 2: Sum Formula (Optimal)

Expected sum of numbers from `0` to `n`:

```java
n * (n + 1) / 2
```

Subtract actual sum from expected sum.

```java
class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int expectedSum = n * (n + 1) / 2;
        int actualSum = 0;

        for (int num : nums) {
            actualSum += num;
        }

        return expectedSum - actualSum;
    }
}
```

**Time:** `O(n)`  
**Space:** `O(1)`

---

## Key Learning
- HashSet gives easy lookup but uses extra space  
- Sum formula is more optimal and interview-friendly
