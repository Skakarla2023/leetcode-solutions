class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int n = nums.length;
        int sum = 0;
        
        
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }

        int maxSum = sum;
        for (int right = k; right < n; right++) {
            int left = right - k;
            sum = sum - nums[left] + nums[right];
            maxSum = Math.max(sum, maxSum);
        }

        return (double)maxSum/k;
    }
}
