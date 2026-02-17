class Solution {
    public int maxArea(int[] height) {
        int leftMax = 0, rightMax = height.length-1;
        int area = 1;
        int maxArea =0;
        while(leftMax < rightMax){
            int width = rightMax - leftMax;
            int length = Math.min(height[leftMax],height[rightMax]);
            area = length*width;
            if(height[leftMax]<height[rightMax]){
                leftMax++;
            }
            else{
                rightMax--;
            }
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
}
