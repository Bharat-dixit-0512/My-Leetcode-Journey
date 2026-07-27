class Solution {
    public int maxProduct(int[] nums) {
        int max=0,smax=0;
        for(int n:nums){
            if(n>max){
                smax=max;
                max=n;
            }
            else if(n>smax){
                smax=n;
            }
        }
        return (max-1)*(smax-1);
    }
}