class Solution {
    public int[] sortedSquares(int[] nums) {
        int left = 0, right = nums.length-1;
        int n = nums.length;
        int[] result = new int[n];
        int index = n-1;
        while(left<=right){
            int leftsum = nums[left]*nums[left];
            int rightsum = nums[right]*nums[right];

            if(leftsum>rightsum){
                result[index]=leftsum;
                left++;
            }
            else {
                result[index]=rightsum;
                right--;
            }
            index--;
        }
        return result;
    }
}
