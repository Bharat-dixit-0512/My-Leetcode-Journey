class Solution {
    public int maxProduct(int[] nums) {
        //max=-2  min=-12  ans=6
        int max=nums[0],min=nums[0],ans=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<0){
                int temp=max;
                max=min;
                min=temp;
            }
            max=Math.max(nums[i],max*nums[i]);
            min=Math.min(nums[i],min*nums[i]);

            ans=Math.max(ans,max);
        }
        return ans;
    }
}