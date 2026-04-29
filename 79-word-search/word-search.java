class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (fun(board, word, i, j, 0))
                    return true;
            }
        }
        return false;
    }
    private boolean fun(char[][]board,String word,int i,int j,int idx){
        if(idx==word.length())return true;
        if(i<0 || i>=board.length || j<0 || j>=board[0].length || board[i][j]!=word.charAt(idx))return false;
        
        char ch=board[i][j];
        board[i][j]='#';

        boolean res=fun(board,word,i+1,j,idx+1) || fun(board,word,i-1,j,idx+1) || fun(board,word,i,j+1,idx+1) || fun(board,word,i,j-1,idx+1);
        board[i][j]=ch;
        return res;
    }
}