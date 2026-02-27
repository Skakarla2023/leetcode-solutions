class Solution {
    public int splitArray(int[] nums, int k) {
        int low = 0, high = 0;
        for (int i : nums) {
            low = Math.max(i, low);
            high += i;
        }

        while (low < high) {
            int mid = low + (high - low) / 2;
            if (count(mid, nums) > k) {
                low = mid + 1;
            } else {
                high = mid;
            }
        }
        return low;
    }

    static int count(int mid, int[] arr) {
        int std_count = 1;
        int sum = 0;

        for (int i : arr) {
            if (sum + i <= mid) {
                sum += i;
            } else {
                std_count++;
                sum = i;
            }
        }
        return std_count;
    }
}
