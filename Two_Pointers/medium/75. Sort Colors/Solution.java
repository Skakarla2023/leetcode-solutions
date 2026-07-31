class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;

        int max = 0;
        for (int i : nums) {
            max = Math.max(i, max);
        }

        int[] count = new int[max + 1];
        for (int i = 0; i < n; i++) {
            int num = nums[i];
            count[num]++;
        }

        int idx = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                nums[idx++] = i;
            }
        }
    }
}
