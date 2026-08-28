class Solution {
    public boolean judgeCircle(String moves) {
        if (moves.length() == 0) {
            return true;
        }

        if (moves.length() % 2 != 0) {
            return false;
        }

        int n = moves.length();
        int x = 0, y = 0;
        for (char ch : moves.toCharArray()) {
            if (ch == 'L') {
                x--;
            } else if (ch == 'R') {
                x++;
            } else if (ch == 'U') {
                y--;
            } else {
                y++;
            }
        }
        return x == 0 && y == 0;
    }
}
