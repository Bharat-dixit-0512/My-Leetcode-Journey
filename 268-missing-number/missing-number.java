class Solution {
    public int missingNumber(int[] nums) {
        int xor=0;
        for(int i:nums){
            xor^=i;
        }
        for(int i=0;i<=nums.length;i++){
            xor^=i;
        }
        return xor;
    }
}