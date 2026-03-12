// Brute Force - O(n^2) time | space : O(1)
// not optimal : nested loops check every pair

class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int first = nums[i];
            for (int j = i + 1; j < n; j++) {
                int second = nums[j];
                int sum = first + second;
                if (target == sum) {
                    return new int[] { i, j };
                }
            }
        }
        return new int[] { 0, 0 };
    }
}
