// we should keep track of the naturally happy customers there, and along with that we are finding the max profit we can make anywhere using that secret power of the owner which we can summarise as baseCost+savdCost where savedcost is the cost saved by owner, when he is grumpy and he used his superower
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int n = customers.length;
        int k = minutes;

        int savedCost = 0;
        int baseCost = 0;

        for (int i = 0; i < n; i++) {
            if (grumpy[i] == 0) {
                baseCost += customers[i];
            }
        }

        for (int i = 0; i < k; i++) {
            if (grumpy[i] == 1) {
                savedCost += customers[i];
            }
        }

        int maxProfit = savedCost;

        for (int i = k; i < n; i++) {

            if (grumpy[i - k] == 1) {
                savedCost -= customers[i - k];
            }

            if (grumpy[i] == 1) {
                savedCost += customers[i];
            }
            maxProfit = Math.max(savedCost, maxProfit);
        }
        return maxProfit + baseCost;
    }
}
