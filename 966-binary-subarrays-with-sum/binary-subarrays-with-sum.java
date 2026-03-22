class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return atMost(nums,goal)-atMost(nums,goal-1);
    }
    public int atMost(int[] nums,int goal){
    if(goal<0)return 0;
        int count=0,sum=0,start=0;
        for(int end=0;end<nums.length;end++){
            sum+=nums[end];
            while(sum>goal){
                sum-=nums[start];
                start++;
            }
            count+=end-start+1;
        }
        return count;
    }
}