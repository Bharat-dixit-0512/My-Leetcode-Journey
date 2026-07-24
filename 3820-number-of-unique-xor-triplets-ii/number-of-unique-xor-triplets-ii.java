class Solution {
    public int uniqueXorTriplets(int[] nums) {
        final int MAX_XOR=2048;
        boolean[] pairXor=new boolean[MAX_XOR];
        boolean[] tripletXor=new boolean[MAX_XOR];

        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                pairXor[nums[i]^nums[j]]=true;
            }
        }
        for(int i=0;i<MAX_XOR;i++){
            if(!pairXor[i])continue;
            for(int v:nums){
                tripletXor[i^v]=true;
            }
        }
        int count=0;
        for(boolean exists:tripletXor){
            if(exists)count++;
        }
        return count;
    }
}