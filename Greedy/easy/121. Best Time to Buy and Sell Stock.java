class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int profit = 0;

        for (int i : prices) {
            min = Math.min(i, min);
            profit = Math.max(i - min, profit);
        }
        return profit;
    }
}

// here we took a single for loop because for every index we have to find the minimum price found so far, and based on that we have to calculate the maximum profit.
