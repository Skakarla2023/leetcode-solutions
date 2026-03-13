// 217. Contains Duplicate
// Difficulty: Easy  |  Topic: Arrays & Hashing
// Time: O(n)  |  Space: O(n)

import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (set.contains(i)) {
                return true;
            }
            set.add(i);
        }
        return false;
    }
}
