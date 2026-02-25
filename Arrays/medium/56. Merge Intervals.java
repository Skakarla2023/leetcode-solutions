import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        Arrays.sort(intervals,(a,b)->a[0] - b[0]);
        int[][] res = new int[n][2];
        int index = 0;
        res[0]=intervals[0];

        for(int i=1;i<n;i++){
            int[] curr = intervals[i];
            int[] prev = res[index];
            if(curr[0]<=prev[1]){
                prev[1]= Math.max(curr[1],prev[1]);
            }
            else{
                index++;
                res[index]=curr;
            }
        }
        return Arrays.copyOf(res,index+1);
    }
}
