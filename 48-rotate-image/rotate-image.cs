public class Solution {
    public void Rotate(int[][] matrix) {
        for(int i=0;i<matrix.Length;i++){
            for(int j=i;j<matrix[0].Length;j++){
                int temp=matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        foreach(var arr in matrix){
            reverse(arr);
        }
    }
    private void reverse(int[] arr){
        int left=0,right=arr.Length-1;
        while(left<right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
    }
}