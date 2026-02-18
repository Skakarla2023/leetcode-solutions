class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int closestsum = nums[0] + nums[1] + nums[2];

        for(int i=0;i<nums.length-2;i++){
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int a = nums[i];
            int start = i+1;
            int end = nums.length-1;
            while(start < end){
                int sum = a+nums[start]+nums[end];
                if(Math.abs(closestsum-target) > Math.abs(sum-target)){
                    closestsum = sum;
                }
                if(sum<target){
                    start++;
                }
                else if(sum>target){
                    end--;
                }
                else{
                    return sum;
                }
            }
        }
        return closestsum;
    }
}
