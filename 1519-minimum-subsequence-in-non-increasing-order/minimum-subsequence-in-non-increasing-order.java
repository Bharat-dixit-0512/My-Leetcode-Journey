class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> ans=new ArrayList<>();
        Arrays.sort(nums);
        int sum=0;
        for(int n:nums){
            sum+=n;
        }
        int curr=0;
        for(int i=nums.length-1;i>=0;i--){
            ans.add(nums[i]);
            curr+=nums[i];
            sum-=nums[i];
            if(sum<curr)
            {
               break;
            }
        }
        return ans;       
    }
}