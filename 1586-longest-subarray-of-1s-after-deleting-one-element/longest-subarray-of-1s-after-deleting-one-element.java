class Solution{
    public int longestSubarray(int[] nums){
        int zero=0;
        int s=0;
        int max=0;
        for(int e=0;e<nums.length;e++){
            if(nums[e]==0) zero++;
            while(zero>1){
                if(nums[s]==0)zero--;
                s++;
            }
            int size=e-s+1;
            max=Math.max(max,size);
        }
        return max-1;
    }
}