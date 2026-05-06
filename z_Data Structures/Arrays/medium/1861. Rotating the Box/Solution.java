class Solution {
    public char[][] rotateTheBox(char[][] box) {
        int n = box.length;
        int m = box[0].length;

        for (int i = 0; i < n; i++) {
            int pos = m - 1;

            for (int j = m - 1; j >= 0; j--) {
                if (box[i][j] == '*') {
                    pos = j - 1;
                } else if (box[i][j] == '#') {
                    box[i][pos] = '#';

                    // each stone ('#') is processed exactly once and placed directly into its final position.
                    // Irrespective of how many '.' are there, each '#' goes straight to its correct pos.
                    // We never “slide” a stone step-by-step through multiple '.' cells.
                    if (pos != j) {
                        box[i][j] = '.';
                    }
                    pos--;
                }
            }
        }

        char[][] rot = new char[m][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                rot[j][n - 1 - i] = box[i][j];
            }
        }

        return rot;
    }
}
