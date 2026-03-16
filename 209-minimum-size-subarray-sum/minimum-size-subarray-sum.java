class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum=0,wsize=Integer.MAX_VALUE;
        int start=0;
        int end=0;
        while(end<nums.length){
            sum+=nums[end];
            end++;
            while(sum>=target){
                wsize=Math.min(wsize,end-start);
                sum-=nums[start];
                start++;
            }
        }
        return wsize==Integer.MAX_VALUE?0:wsize;
    }
}