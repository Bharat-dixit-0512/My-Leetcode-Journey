class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int maxi=Integer.MIN_VALUE;
        int r=-1;
        int c=-1;
        int m=mat.length;
        int n=mat[0].length;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]>maxi){
                    maxi=mat[i][j];
                    r=i;
                    c=j;
                }
            }
        }
        return new int[]{r,c};
    }
}