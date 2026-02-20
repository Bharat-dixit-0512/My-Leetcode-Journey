class Solution {
    public int longestOnes(int[] nums, int k) {
        int zero=0,s=0,max=0;
        for(int e=0;e<nums.length;e++){
            if(nums[e]==0) zero++;
            while(zero>k){
                if(nums[s]==0)zero--;
                s++;
            }
            int size=e-s+1;
            max=Math.max(max,size);
        }
        return max;
    }
}