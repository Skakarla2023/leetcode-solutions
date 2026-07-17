class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        long sum = 0;
        long maxSum = 0;
        int n = nums.length;

        HashSet<Integer> set = new HashSet<>();

        int left = 0;

        for (int right = 0; right < n; right++) {
            while (set.contains(nums[right])) {               
                sum -= nums[left];
                set.remove(nums[left]);
                left++;
            }

            set.add(nums[right]);
            sum += nums[right];

            if (right - left + 1 == k) {
                maxSum = Math.max(maxSum, sum);

                sum -= nums[left];
                set.remove(nums[left]);
                left++;
            }
        }

        return maxSum;
    }
}
