class Solution {
    static boolean isValid(char ch, int row, int col, char[][] board) {
        
        for(int i=0;i<9;i++){
            // for same element in the row
            if(board[row][i] == ch){
                return false;
            }

            // for same element in the col
            if(board[i][col] == ch) {
                return false;
            }
        }

        // for same 3X3 box
        // int startRow = 3*(row/3);        
        // int startCol = 3*(col/3);

        for(int i = (3*(row/3));i< (3*(row/3))+3;i++) {
            for(int j=(3*(col/3));j< (3*(col/3))+3;j++) {
                if(board[i][j] == ch){
                    return false;
                }
            }
        }

        return true;
    }

    static boolean solve(char[][] board){
        for(int row=0;row<9;row++) {
            for(int col=0;col<9;col++) {
                if(board[row][col]=='.') {
                    for(int num = 1;num<=9;num++) {
                        char ch = (char)(num+'0');
                        if(isValid(ch, row, col, board)) {
                            board[row][col] = ch;
                            if(solve(board)){
                                return true;
                            }
                            board[row][col] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public void solveSudoku(char[][] board) {
        solve(board);
        // if(solve(board)){
        //     printBoard(board);
        // } else {
        //     System.out.println("No Solution exists!");
        // }
    }

    // static void printBoard(char[][] board) {
    //     System.out.println(Arrays.deepToString(board));
    // }
}
