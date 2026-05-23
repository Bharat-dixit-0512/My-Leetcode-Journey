class Solution {
    public int removeElement(int[] nums, int val) {
        int ans[]=new int[nums.length];
        int index=0;

       for(int i=0;i<nums.length;i++){
        if(nums[i]!=val){
           ans[index++]=nums[i];
        }
        }
        for (int i = 0; i < index; i++) {
            nums[i] = ans[i];
       }
       return index;
       
    }
}