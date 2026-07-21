class Solution {
    public int longestOnes(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        int maxCount = 0;
        int zc = 0;

        for (int i : nums) {
            if (i == 0) {
                zc++;
            }
        }

        if (zc == k || zc < k) {
            return n;
        }

        zc = 0;
        int left = 0;
        for (int right = 0; right < n; right++) {
            if (nums[right] == 0) {
                zc++;
            }

            while (zc > k) {
                if (nums[left] == 0) {
                    zc--;
                }
                left++;
            }
            count = right - left + 1;
            maxCount = Math.max(count, maxCount);
        }

        return maxCount;

    }
}
