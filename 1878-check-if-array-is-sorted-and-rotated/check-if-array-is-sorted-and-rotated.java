class Solution {
    public boolean check(int[] nums) {
        int flag = 1;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i]<nums[i-1])
                flag--;
        }
        if(flag==1 ||(flag==0 && nums[nums.length - 1] <= nums[0]))return true;
        return false;
    }
}
