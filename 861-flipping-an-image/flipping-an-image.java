class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int i[]:image){
            rev(i);
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                if(image[i][j]==1) image[i][j]=0;
                else  image[i][j]=1;
            }
        }
        return image;
    }
    private void rev(int []arr){
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int temp=arr[low];
            arr[low]=arr[high];
            arr[high]=temp;
            low++;
            high--;
        }
    }
}