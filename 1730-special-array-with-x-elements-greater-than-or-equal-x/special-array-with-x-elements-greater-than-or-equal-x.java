class Solution {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int left=0,right=n;
        while(left<=right){
            int mid=(left+right)/2;
            int count=countGreaterOrEqual(nums,mid);

            if(count==mid)return mid;
            else if(count>mid)left=mid+1;
            else right=mid-1;
        }
        return -1;
    }
    public int countGreaterOrEqual(int nums[],int x){
        int left=0,right=nums.length-1;
        int index=nums.length;
        while(left<=right){
            int mid=(left+right)/2;

            if(nums[mid]>=x){
                index=mid;
                right=mid-1;
            }
            else{
                left=mid+1;
            }
        }
        return nums.length-index;
    }
}