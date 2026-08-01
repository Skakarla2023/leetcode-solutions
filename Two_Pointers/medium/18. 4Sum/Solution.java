class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        int n = nums.length;

        Arrays.sort(nums);
        List<List<Integer>> list = new ArrayList<>();

        int start;
        int end;
        int x;
        int y;

        for (int i = 0; i < n; i++) {
            x = nums[i];
            for (int j = i + 1; j < n; j++) {
                y = nums[j];
                start = j + 1;
                end = n - 1;
                while (start < end) {
                    long sum = (long) x + y + nums[start] + nums[end];
                    if (sum == target) {
                        List<Integer> sub = Arrays.asList(x, y, nums[start], nums[end]);
                        if (!list.contains(sub)) {
                            list.add(sub);
                        }
                        while (start < end && nums[start] == nums[start + 1])
                            start++;
                        while (start < end && nums[end] == nums[end - 1])
                            end--;
                        start++;
                        end--;
                    } else if (sum < target) {
                        start++;
                    } else {
                        end--;
                    }
                }
            }
        }
        return list;
    }
}
