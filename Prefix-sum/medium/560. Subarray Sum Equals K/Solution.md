import java.util.*;

class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        int count = 0;
        map.put(0, 1);
        int prefixSum = 0;

        for (int i : nums) {
            prefixSum += i;
            if (map.containsKey(prefixSum - k)) {
                count += map.get(prefixSum - k);
            }
            map.put(prefixSum, map.getOrDefault(prefixSum, 0) + 1);
        }

        return count;

    }
}
