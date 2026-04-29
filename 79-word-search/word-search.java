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
        if(i<0 || i>=board.length || j<0 || j>=board[0].length)return false;
        if(board[i][j]!=word.charAt(0)) return false;

        word=word.substring(1);
        if(word.length()==0) return true;

        char ch=board[i][j];
        board[i][j]='#';
        boolean res=(fun(board,word, i+1, j) || fun(board,word, i-1, j) || fun(board,word, i, j+1) || fun(board,word, i, j-1));
        board[i][j]=ch;
        return res;
    }
}