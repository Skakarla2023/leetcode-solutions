class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;

        if(k==1) {
            return nums;
        }

        int size = n - k + 1;
        int[] maxValues = new int[size];
        int ind = 0;
        int max = 0;

        max = findMax(0, k - 1, nums);
        maxValues[ind++] = max;

        for (int i = k; i < n; i++) {
            max = findMax(i - k + 1, i, nums);
            maxValues[ind++] = max;
        }

        return Arrays.copyOf(maxValues, ind);
    }

    static int findMax(int start, int end, int[] nums) {
        int maximum = Integer.MIN_VALUE;

        for (int i = start; i <= end; i++) {
            maximum = Math.max(nums[i], maximum);
        }

        return maximum;
    }
}
