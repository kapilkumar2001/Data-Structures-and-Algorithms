class N_Queens {
    public List<List<String>> solveNQueens(int n) {
        char board[][]=new char[n][n];
        List<List<String>> ans=new ArrayList<>();
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j]='.';
            }
        }
        helper(0,board,ans,new boolean[n],new boolean[2*n-1],new boolean[2*n-1]);
        return ans;
    }
    void helper(int row,char board[][],List<List<String>> ans,boolean left[],boolean upper[],boolean diagonal[]){
        if(row==board.length){
            ArrayList<String> res=new ArrayList<>();
            for(char ch[]:board){
                res.add(new String(ch));
            }
            ans.add(res);
            return;
        }
        for(int col=0; col<board.length; col++){
            if(board[row][col]=='.' && left[col]==false && diagonal[row+col]==false && upper[(board.length-1)+(col-row)]==false){ //check is the queen postion is safe for placing or Not
                board[row][col]='Q'; //if safe then place thq queen
                left[col]=true;
                diagonal[row+col]=true;
                upper[(board.length-1)+(col-row)]=true;
                helper(row+1,board,ans,left,upper,diagonal);
                board[row][col]='.'; //while backtrack remove the queen to explore other posblties 
                left[col]=false;
                diagonal[row+col]=false;
                upper[(board.length-1)+(col-row)]=false;
            }
        }
    }
}