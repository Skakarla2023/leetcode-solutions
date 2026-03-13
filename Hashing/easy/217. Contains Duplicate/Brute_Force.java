// Brute force - O(nlogn) time | space - O(1)
// not optimal dur to its highter time complexity

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        boolean yes = false;

        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                yes = true;
                break;
            }
        }
        return yes;
    }
}
