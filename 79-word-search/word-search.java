class Solution {
    public boolean exist(char[][] board, String word) {
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(fun(board,word,i,j,0))return true;
            }
        }
        return false;
    }
    private boolean fun(char[][] board,String word,int start,int end,int idx){
        if(idx==word.length())return true;
        if(start<0 || start>=board.length || end<0 || end>=board[0].length || board[start][end]!=word.charAt(idx))return false;
        char c=board[start][end];
        board[start][end]='#';
        boolean res=fun(board,word,start+1,end,idx+1)||fun(board,word,start-1,end,idx+1)||fun(board,word,start,end+1,idx+1)||fun(board,word,start,end-1,idx+1);
        board[start][end]=c;
        return res;
    }
}