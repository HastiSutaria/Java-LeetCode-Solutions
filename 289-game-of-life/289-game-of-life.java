class Solution {
    public void gameOfLife(int[][] board) {
        int rows = board.length;
        int cols = board[0].length;
        
        int[][] temp = new int[rows][cols];
        for(int r=0; r<rows; r++){
            for(int c=0; c<cols; c++){
                int neighbors = friends(board, r-1,c-1) + friends(board, r-1,c) + friends(board,r-1,c+1) +friends(board, r, c-1) + friends(board,r,c+1) + friends(board,r+1,c-1) + friends(board,r+1, c) + friends(board, r+1, c+1);
                if(board[r][c] == 1){ 
                temp[r][c] = (neighbors < 2 || neighbors > 3) ? 0 : 1;     
            }else{ 
                temp[r][c] = (neighbors == 3) ? 1 : 0;
            }
            }
        }
          for(int r = 0; r < rows; r++){
        board[r] = temp[r].clone();                                                // 
    }
    }
    public int friends(int[][] board, int r, int c){
    if( r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] == 0 ){ return 0; }                        
    return 1;
}
}