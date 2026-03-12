// 1. Two Sum
// Difficulty: Easy  |  Topic: Arrays & Hashing
// Time: O(n)  |  Space: O(n)

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int first = nums[i];
            int second = target - first;
            if (map.containsKey(second)) {
                return new int[] { i, map.get(second) };
            }
            map.put(nums[i], i);
        }
        return new int[] { 0, 0 };
    }
}
