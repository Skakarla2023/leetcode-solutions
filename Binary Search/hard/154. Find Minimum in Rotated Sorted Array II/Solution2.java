class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;

            if (nums[start] < nums[end]) {
                return nums[start];
            } else if (nums[mid] > nums[end]) {
                start = mid + 1;
            } else if (nums[mid] == nums[end]) {
                end--;
            } else {
                end = mid;
            }

        }
        return nums[start];
    }
}
