## Greedy Algorithms

Greedy algorithms always pick the **best immediate choice** without reconsidering previous decisions.

**Greedy = always pick the best immediate choice without worrying about the future.**

---

### Why Do We Need Greedy Algorithms?

Some problems are very expensive to solve using **brute force or recursion** because they have **many possible combinations**.

Greedy algorithms help because they:

- make **fast decisions**
- **reduce time complexity**
- avoid checking **all possibilities**
- work well when a problem has **greedy property**

---

## Key Properties of Greedy Algorithm

### 1. Greedy Choice Property
A **locally optimal solution** leads to a **globally optimal solution**.

### 2. Optimal Substructure
The **optimal solution** of a problem can be built from the **optimal solutions of its subproblems**.

---

## General Patterns in Greedy Problems

### 1. Sort + Choose Best Option
Example: **Interval problems**

### 2. Maintain Best Running Value
Example: **Stock profit problems**

### 3. Use Min / Max Boundary
Example: **Gas Station problem**

---

### How to Identify a Greedy Problem?

Ask yourself:

- Can I make the **best choice right now**?
- Do I **not need to reconsider previous decisions**?
- Does **sorting help simplify the problem**?
- Does choosing **smallest / largest / earliest** solve it?

If **yes**, then **Greedy might work**.

---

### Time Complexity

Most greedy solutions are:

- **O(n)**  
- **O(n log n)** (usually because of sorting)

---

## Important Greedy Problems

### Easy Level

These teach you **basic greedy thinking**.

#### 1. [Assign Cookies](https://leetcode.com/problems/assign-cookies/)
Pattern: **Sort + match smallest with smallest**

#### 2. [Best Time to Buy and Sell Stock](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/)
Pattern: **Keep track of minimum so far**

#### 3. [Can Place Flowers](https://leetcode.com/problems/can-place-flowers/)
Pattern: **Local greedy placement**

#### 4. [Minimum Number of Arrows to Burst Balloons](https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/)
Pattern: **Interval greedy (sort by end)**

#### 5. [Lemonade Change](https://leetcode.com/problems/lemonade-change/)
Pattern: **Greedy simulation**

#### 6. [Maximum Units on a Truck](https://leetcode.com/problems/maximum-units-on-a-truck/)
Pattern: **Sort by profit/value**

---

### Medium Level

These are **very common interview problems**.

#### 7. [Gas Station](https://leetcode.com/problems/gas-station/)
Pattern: **Reset starting point when tank < 0**

Very important greedy logic.

---

#### 8. [Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/)
Pattern: **Interval scheduling**

Sort by **end time**.

---

#### 9. [Partition Labels](https://leetcode.com/problems/partition-labels/)
Pattern: **Greedy window expansion**

Very famous interview problem.

---

#### 10. [Jump Game](https://leetcode.com/problems/jump-game/)
Pattern: **Track farthest reachable**

Classic greedy reachability problem.

---

#### 11. [Jump Game II](https://leetcode.com/problems/jump-game-ii/)
Pattern: **Greedy BFS-style jumps**

---

#### 12. [Bag of Tokens](https://leetcode.com/problems/bag-of-tokens/)
Pattern: **Two-pointer greedy**

---

#### 13. [Reorganize String](https://leetcode.com/problems/reorganize-string/)
Pattern: **Greedy with heap**

Very common string greedy.


---

### Hard Level

These require **strong greedy intuition** and sometimes combine **heaps or advanced patterns**.

#### 14. [Candy](https://leetcode.com/problems/candy/)
Pattern: **Two-pass greedy**

Very famous greedy problem.

---

#### 15. [Task Scheduler](https://leetcode.com/problems/task-scheduler/)
Pattern: **Greedy with frequency**

Classic scheduling + greedy counting problem.

---

#### 16. [Minimum Number of Refueling Stops](https://leetcode.com/problems/minimum-number-of-refueling-stops/)
Pattern: **Greedy + max heap**

Very strong interview problem.




