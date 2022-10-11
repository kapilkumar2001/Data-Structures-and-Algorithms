class SudokuSolver {
    public void solveSudoku(char[][] board) {
         helper(board);
    }
    boolean helper(char[][] board){
        for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(board[i][j]=='.'){ //traverse the matrix and find the empty place
//                      once we find the empty place than we tried all the numbers from 1 to 9 and check that it is a valid number or not by checking the rules.
// and we find the correct number for that place than we find for the second empty place in 9 X 9 matrix.for second empty place we repeat the same process
                    for(char ch='1'; ch<='9'; ch++){
                        if(isValid(board,i,j,ch)){
                            board[i][j]=ch;
                            if(helper(board)) return true; //and after all recursive calls we got true, than we have to stop over there only and no need to search for other solutions.
                            else board[i][j]='.'; //after getting the false from solve(board) function we make all the places empty that we have filled . than try for other member for first empty place
                        }
                    }
                    return false; //and if we doesn't get any number, so we return false.
                }
                
            }
        }
        return true;
    }
    private boolean isValid(char[][] board, int row, int col, char c){
        for(int i = 0; i < 9; i++) {
            if(board[i][col] != '.' && board[i][col] == c) return false; //check row
            if(board[row][i] != '.' && board[row][i] == c) return false; //check column
            if(board[3 * (row / 3) + i / 3][3 * (col / 3) + i % 3] == c) return false; //check 3*3 block
        }
        return true;
    }
}