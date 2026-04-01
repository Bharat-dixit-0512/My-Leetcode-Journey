class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        for(int[]ar:image){
            rev(ar);
        }
        for(int i=0;i<image.length;i++){
            for(int j=0;j<image[0].length;j++){
                image[i][j] ^= 1;
            }
        }
        return image;
    }
    public void rev(int[]arr){
        int left=0;
        int right=arr.length-1;
        while(left<=right){
            int temp=arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }

    }
}