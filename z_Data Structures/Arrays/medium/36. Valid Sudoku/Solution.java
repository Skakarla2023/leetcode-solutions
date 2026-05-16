class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] != '.') {
                    char ch = board[r][c];

                    board[r][c] = '.';
                    if (!isValid(board, r, c, ch)) {
                        return false;
                    }

                    board[r][c] = ch;

                }
            }
        }
        return true;
    }

    public static boolean isValid(char[][] board, int r, int c, char ch) {
        for (int i = 0; i < 9; i++) {
            if (board[r][i] == ch) {
                return false;
            }

            if (board[i][c] == ch) {
                return false;
            }
        }

        int startRow = (r / 3) * 3;
        int startCol = (c / 3) * 3;

        for (int a = startRow; a < startRow + 3; a++) {
            for (int b = startCol; b < startCol + 3; b++) {
                if (board[a][b] == ch) {
                    return false;
                }
            }
        }

        return true;
    }
}
