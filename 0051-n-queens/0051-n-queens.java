class Solution {
     List<List<String>> result;
    public List<List<String>> solveNQueens(int n) {
       
        
        result = new ArrayList<>();
        //initialize the board as empty cells
        
        char[][] board = new char[n][n];
        for(int i = 0; i<n;i++){
            for(int j = 0;j<n;j++){
                board[i][j] = '.';
            }
        }
        List<int[]> queens = new ArrayList<>();
        dfs(board,0,queens);
        return result;
    }
    
    private void dfs(char[][] board, int r, List<int[]> queens){
        //to check if all the queens are placed or not
        if(queens.size() == board.length){
            List<String> rows = new ArrayList<>();
            for (char[] row : board){
                rows.add(new String(row));
            }
            result.add(rows);
        }
        //if not then add queens to the board
        for(int c = 0; c<board.length;c++){
            if(addQueen(r,c,queens)){
                board[r][c] = 'Q';
                queens.add(new int[]{r,c});
                dfs(board, r+1, queens); //dfs for other rows
                board[r][c] = '.';  // backtracking for other positions after adding queens
                queens.remove(queens.size()-1); //removing the queen added
            }
        }
    }

    private boolean addQueen(int r,int c, List<int[]> queen){
        for(int[] q:queen){
            int diffX = Math.abs(r-q[0]);
            int diffY = Math.abs(c-q[1]);
            if(diffX==0 || diffY==0 || diffX==diffY){
                return false;
            }
        }
        return true;
    }
}