class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length<3) return false;

        int peak=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[peak]){
                peak=i;
            }
        }

        if(peak==0 || peak==arr.length-1) return false;

        for(int i=0;i<peak;i++){
            if(arr[i]>=arr[i+1]){
                return false;
            }
        }

        for(int i=peak;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
                return false;
            }
        }

        return true;
    }
}