class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // this is a variable size sliding windwo problem
        // slide the window from left right
        // keep on adding the number ar nums[right]
        // if sum becomes greater than target, remove nums[left] or else add nums[right]
        // each time you update the sum, update the count and also the mincount

        int count = 0;
        int n = nums.length;

        int left = 0;
        int sum = 0;
        int minCount = Integer.MAX_VALUE;
        for (int right = 0; right < n; right++) {
            sum += nums[right];
            while (sum >= target) {
                count = right - left + 1;
                minCount = Math.min(count, minCount);

                sum -= nums[left];
                left++;
            }
        }
        return minCount == Integer.MAX_VALUE ? 0 : minCount;
    }
}
