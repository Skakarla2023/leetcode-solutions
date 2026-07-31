class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        int start;
        int end;
        int sum = 0;
        Arrays.sort(nums);

        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {

            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            start = i + 1;
            end = n - 1;
            int x = nums[i];
            while (start < end) {
                sum = x + nums[start] + nums[end];
                if (sum == 0) {
                    res.add(new ArrayList<>(List.of(x, nums[start], nums[end])));

                    while (start < end && nums[start] == nums[start + 1])
                        start++;
                    while (start < end && nums[end] == nums[end - 1])
                        end--;

                    start++;
                    end--;
                } else if (sum > 0) {
                    end--;
                } else {
                    start++;
                }
            }
        }
        return res;
    }
}
