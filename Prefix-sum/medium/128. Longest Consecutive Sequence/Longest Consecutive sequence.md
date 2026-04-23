## Longest Consecutive Sequence

**The Problem:** Given an unsorted array of numbers, find the length of the longest sequence of consecutive integers.

**Example:**
```
Input:  [100, 4, 200, 1, 3, 2]
Output: 4
```
Because `1 → 2 → 3 → 4` is the longest consecutive chain.

---

### The Naive Way (slow ❌)
Sort the array, then count streaks. Works, but sorting takes **O(n log n)**.

---

### The Smart Way — HashSet (O(n) ✅)

**Key Insight:** Only start counting from the *beginning* of a sequence.

How do you know if a number is the start? → **Its (num - 1) does NOT exist in the set.**

**Steps:**
1. Put all numbers in a `HashSet` (for O(1) lookup)
2. For each number, check if `num - 1` exists
   - If **yes** → skip (it's not the start)
   - If **no** → it's a sequence start! Count forward: `num+1`, `num+2`... until the chain breaks
3. Track the max count

---

### Dry Run
```
nums = [100, 4, 200, 1, 3, 2]
set  = {100, 4, 200, 1, 3, 2}

num=100 → 99 not in set → start! → 101? No → streak = 1
num=4   → 3 in set     → skip
num=200 → 199 not in set → start! → 201? No → streak = 1
num=1   → 0 not in set  → start! → 2✓ 3✓ 4✓ 5? No → streak = 4  ✅
num=3   → 2 in set     → skip
num=2   → 1 in set     → skip

Answer = 4
```

---

### Code (Java)
```java

    for (int n : set) {
        if (!set.contains(n - 1)) {      // start of a sequence
            int cur = n, streak = 1;
            while (set.contains(cur + 1)) {
                cur++;
                streak++;
            }
            maxLen = Math.max(maxLen, streak);
        }

```

---

### Why is it O(n)?
Even though there's a `while` loop inside a `for` loop, each number is only visited **once** as part of a streak. So total work = n.

**The trick is: skip everything that isn't a sequence start.** 🎯
