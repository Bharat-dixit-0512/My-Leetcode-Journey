class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int[]result=new int[n];
        for(int i=0;i<n;i++){
            result[i]=-1;
            for(int j=1;j<n;j++){
                int nidx=(i+j)%n;
                if(nums[nidx]>nums[i]){
                    result[i]=nums[nidx];
                    break;
                }
            }
        }
        return result;
    }
}