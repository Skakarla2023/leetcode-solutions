class Solution {
    public int[] getAverages(int[] nums, int k) {
        int size = 2 * k + 1;
        int n = nums.length;

        int[] res = new int[n];

        Arrays.fill(res, -1);

        if (size > n) {
            return res;
        }

        long windowSum = 0;

        for (int i = 0; i < size; i++) {
            windowSum += nums[i];
        }

        res[k] = (int) (windowSum / size);

        for (int i = size; i < n; i++) {
            windowSum -= nums[i - size];
            windowSum += nums[i];

            int idx = i - k;
            res[idx] = (int) (windowSum / size);
        }

        return res;
    }
}
