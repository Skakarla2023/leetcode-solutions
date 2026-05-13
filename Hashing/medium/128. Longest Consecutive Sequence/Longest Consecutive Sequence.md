# 128. Longest Consecutive Sequence

- **Difficulty** : medium
- **Time complexity** : O(n)
- **Space Complexity** : O(n)
- **Approach used** : Hashing


### Problem statement

Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

```
Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
```


#### Constraints:

- 0 <= nums.length <= 105
- -109 <= nums[i] <= 109


### Approach

- Use **HashSet**.
- For every element we check the longest increasing sequence at that particular element, bu using a variable called count, and increment it whenever we find (ele+count).
- After finding count at each element, find the maximum among them and return it.


**PseudoCode**:


```java

for (int i : set) {
  if (!set.contains(i - 1)) {
    int count = 1;
    while (set.contains(i + count)) {
      count++;
    }
    max = Math.max(count, max);
  }
}

``

