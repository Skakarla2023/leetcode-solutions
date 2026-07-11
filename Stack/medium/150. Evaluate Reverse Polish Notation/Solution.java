class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        Arrays.fill(ans, -1);

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < 2*n; i++) {
            int cirInd = (i%n);

            while (!stack.isEmpty() && nums[cirInd] > nums[stack.peek()]) {
                int ind = stack.pop();
                ans[ind] = nums[cirInd];
            }
            stack.push(cirInd);
        }

        return ans;

    }
}
