class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int left = 1; 
        int right = getMax(nums); 
        int ans = -1;
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (sum(nums, mid) <= threshold) {
                ans = mid;
                right = mid - 1; 
            } else {
                left = mid + 1; 
            }
        }
        return ans;
    }
    public int sum(int nums[],int divisor){
        int sum=0;
        for(int i:nums){
            sum+=Math.ceil((double)i/divisor);
        }
        return sum;
    }
    public int getMax(int arr[]){
        int max=0;
        for(int i:arr){
            max=Math.max(max,i);
        }
        return max;
    }
}