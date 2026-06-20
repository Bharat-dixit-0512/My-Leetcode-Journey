class Solution {
    public List<List<String>> solveNQueens(int n) {
        char[][] chess=new char[n][n];
        for(char r[]:chess)Arrays.fill(r,'.');
        List<List<String>> res=new ArrayList<>();
        solve(res,chess,0);
        return res;
    }
    void solve(List<List<String>> res, char[][] chess,int row){
        if(row==chess.length){
            res.add(construct(chess));
            return;
        }
        for(int col=0;col<chess.length;col++){
            if(valid(chess,row,col)){
                chess[row][col]='Q';
                solve(res,chess,row+1);
                chess[row][col]='.';
            }
        }
    }
    boolean valid(char[][]chess,int row,int col){
        //check all columns
        for(int i=0;i<row;i++){
            if(chess[i][col]=='Q'){
                return false;
            }
        }

        // check upper-right diagonal (45 degrees)
        int i = row - 1;
        int j = col + 1;
        while (i >= 0 && j < chess.length) {
            if (chess[i][j] == 'Q') {
                return false;
            }
            i--;
            j++;
        }
        // check upper-left diagonal (135 degrees)
        i = row - 1;
        j = col - 1;
        while (i >= 0 && j >= 0) {
            if (chess[i][j] == 'Q') {
                return false;
            }
            i--;
            j--;
        }
        return true;
    }
    List<String> construct(char[][] chess){
        List<String> path=new ArrayList<>();
        for(int i=0;i<chess.length;i++){
            path.add(new String(chess[i]));
        }
        return path;
    }
}