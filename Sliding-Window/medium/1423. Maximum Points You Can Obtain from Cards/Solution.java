class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;

        int winSize = n - k;
        int totalsum = 0;
        int sum = 0;

        for (int i : cardPoints) {
            totalsum += i;
        }

        for (int i = 0; i < winSize; i++) {
            sum += cardPoints[i];
        }

        int minSum = sum;

        for (int i = winSize; i < n; i++) {
            sum -= cardPoints[i - winSize];
            sum += cardPoints[i];

            minSum = Math.min(sum, minSum);
        }

        return totalsum - minSum;
    }
}
