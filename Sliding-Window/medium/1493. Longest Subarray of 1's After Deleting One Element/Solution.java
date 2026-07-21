class Solution {
    public int longestSubarray(int[] nums) {
        int n = nums.length;
        int zc = 0;

        int count = 0;
        int maxCount = 0;

        int left = 0;
        for(int right = 0;right<n;right++) {
            if(nums[right]==0) {
                zc++;
            }

            while(zc>1) {
                if(nums[left]==0) {
                    zc--;
                }
                left++;
            }

            count = right-left;
            maxCount = Math.max(count, maxCount);
        }
        return maxCount;
    }
}
