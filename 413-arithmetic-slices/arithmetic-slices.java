class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if(nums.length<3)return 0;
        int count=0,start=0;
        int sub[]=new int[nums.length];
        sub[nums.length-1]=0;
        for(int i=1;i<nums.length;i++){
            sub[i-1]=nums[i]-nums[i-1];
        }
        int streak = 1;
        for (int i = 1; i < nums.length - 1; i++) {
            if (sub[i] == sub[i - 1]) {
                streak++;
                if (streak >= 2) {
                    count +=streak-1; 
                }
            } else {
                streak = 1;
            }
        }
        return count;
    }

    // public boolean aSequence(int[] arr){
    //     int ans[]=new int[arr.length];
    //     for(int i=1;i<arr.length;i++){
    //         ans[i-1]=arr[i]-arr[i-1];
    //     }
    //     for(int i=0;i<arr.length-1;i++){
    //         if(arr[i+1]!=arr[i])return false;
    //     }
    //     return true;
    // }
}