class Solution {
    public int[] dailyTemperatures(int[] nums) {
        Stack<Integer> stack = new Stack<>();

        int[] ans = new int[nums.length];

        for(int i=0;i<nums.length;i++) {
            while(!stack.isEmpty() && nums[i] > nums[stack.peek()]) {
                int poppedInd = stack.pop();
                ans[poppedInd] = i - poppedInd;
            }

            stack.push(i);
        }


        return ans;
        

    }
}
