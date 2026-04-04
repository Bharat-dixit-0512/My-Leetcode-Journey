class Solution {
    public boolean findRotation(int[][] mat, int[][] target) {

        int deg=360;
        while(deg!=0){
            if(Arrays.deepEquals(mat,target))return true;
            rotate(mat);
            deg-=90;
        }
        return false;
    }
    public void rotate(int[][]mat){
        for(int i=0;i<mat.length;i++){
            for(int j=i+1;j<mat[0].length;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i[]:mat){
            rev(i);
        }

    }private void rev(int mat[]){
        int l=0,r=mat.length-1;
        while(l<r){
            int temp=mat[l];
            mat[l]=mat[r];
            mat[r]=temp;
            l++;
            r--;
        }
    }
}