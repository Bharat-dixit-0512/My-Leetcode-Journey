class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]==word.charAt(0)){
                    if(fun(board,word,i,j))return true;
                }
            }
        }
        return false;
    }
    private boolean fun(char board[][],String word,int i,int j){
        if(word.length()==0) return true;
        if(i<0 || i>=board.length || j<0 || j>=board[0].length)return false;
        if(board[i][j]!=word.charAt(0)) return false;
        char ch=board[i][j];
        board[i][j]='#';
        boolean res=false;
        res|=fun(board,word.substring(1), i+1, j);
        res|=fun(board,word.substring(1), i-1, j);
        res|=fun(board,word.substring(1), i, j+1);
        res|=fun(board,word.substring(1), i, j-1);
        board[i][j]=ch;
        return res;
    }
}