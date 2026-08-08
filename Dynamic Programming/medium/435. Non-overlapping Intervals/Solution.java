class Solution {
    public int eraseOverlapIntervals(int[][] intervals) {
        int n = intervals.length;

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[1], b[1]));

        int count = 1;
        int i = 0;
        for (int j = 1; j < n; j++) {
            if (intervals[j][0] >= intervals[i][1]) {
                count++;
                i = j;
            }
        }

        return n - count;

    }
}
