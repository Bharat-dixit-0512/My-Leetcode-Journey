class Solution {
    public int rob(int[] nums) {
        int prev=0,prev1=0;
        for(int i=0;i<nums.length;i++){
            int curr=Math.max(nums[i]+prev,prev1);
            prev=prev1;
            prev1=curr;
        }
        return prev1;
    }
}