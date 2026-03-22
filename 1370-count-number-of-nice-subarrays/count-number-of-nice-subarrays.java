class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        int start=0,count=0,sum=0,res=0;
        for(int end=0;end<nums.length;end++){
            if(odd(nums[end])){
                sum++;
                count=0;
            }while(sum==k){
                if(odd(nums[start])){
                    sum--;
                }
                start++;
                count++;
            }
            res+=count;
        }
        return res;
    }
    public boolean odd(int n){
        return n%2==1;
    }
}