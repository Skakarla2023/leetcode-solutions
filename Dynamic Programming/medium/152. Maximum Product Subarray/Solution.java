class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;

        int curr_max = nums[0];
        int curr_min = nums[0];
        int max = 0;

        for (int i = 1; i < n; i++) {
            int temp = curr_max;
            curr_max = Math.max(nums[i], Math.max(nums[i] * temp, nums[i] * curr_min));
            curr_min = Math.min(nums[i], Math.min(nums[i] * temp, nums[i] * curr_min));

            max = Math.max(max, Math.max(curr_min, curr_max));
        }

        return max;
    }
}
