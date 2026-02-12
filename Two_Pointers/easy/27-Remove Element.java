class Solution {
    public int removeElement(int[] nums, int val) {
        int count = 0;
        int start=0,end=nums.length-1;
        while(start<end){
            if(nums[start]==val){
                if(nums[end]!=val){
                    int temp = nums[start];
                    nums[start] = nums[end];
                    nums[end] = temp;
                    start++;
                    end--;
                }
                else{
                    end--;
                }
            }
            else{
                start++;
            }
        }
        int i=0;
        while(i<nums.length){
            if(nums[i]!=val){
                count++;
                i++;
            }
            else{
                i++;
            }
        }
        return count;
    }
}
