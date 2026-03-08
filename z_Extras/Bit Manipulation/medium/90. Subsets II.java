class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int n = nums.length;
        int total = 1 << n;

        Arrays.sort(nums);

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < total; i++) {
            List<Integer> list = new ArrayList<>();
            boolean valid = true;
            for (int j = 0; j < n; j++) {
                if ((i & (1 << j)) != 0) {
                    if (j > 0 && nums[j] == nums[j - 1] && (i & (1 << (j - 1))) == 0) {
                        valid = false;
                        break;
                    }
                    list.add(nums[j]);
                }
            }
            if (valid) {
                result.add(list);
            }
        }
        return result;
    }
}
