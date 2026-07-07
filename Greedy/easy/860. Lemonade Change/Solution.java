class Solution {
    public boolean lemonadeChange(int[] bills) {
        int n = bills.length;

        int fiveC = 0;
        int tenC = 0;
        int twentyC = 0;

        for (int i = 0; i < n; i++) {
            if (bills[i] == 5) {
                fiveC++;
            }
            if (bills[i] == 10) {
                if (fiveC == 0) {
                    return false;
                } else {
                    fiveC--;
                    tenC++;
                }

            }
            if (bills[i] == 20) {
                if (tenC > 0 && fiveC > 0) {
                    tenC--;
                    fiveC--;
                    twentyC++;
                } else if (fiveC >= 3) {
                    fiveC -= 3;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
