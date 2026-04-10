class Solution {
    public boolean check(int[] nums) {
        int count = 0, sum = 0, flag = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= nums[i - 1]) {
                count++;
            } else {
                flag--;
                sum += count; 
                count = 0; 
            }
        }
        sum+=count;
        if(flag==1)return true;
        if(flag==0 && nums[nums.length - 1] <= nums[0])return true;
        return false;
    }
}
