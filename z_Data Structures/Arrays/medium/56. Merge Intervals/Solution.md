import java.util.*;

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        int n = intervals.length;

        int[][] res = new int[n][2];
        res[0] = intervals[0];
        int ind = 0;

        for(int i=1;i<n;i++) {
            int[] data = intervals[i];
            int[] prev = res[ind];

            if(data[0] <= prev[1]) {
                prev[1] = Math.max(data[1], prev[1]);
            } else {
                ind++;
                res[ind] = data;
            }
        }

        return Arrays.copyOf(res, ind+1);
    }
}
