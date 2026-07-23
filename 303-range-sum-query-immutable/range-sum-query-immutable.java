class NumArray {
    private int[] num;
    public NumArray(int[] nums) {
        int n=nums.length;
        num=new int[n+1];
        num[0]=0;
        for(int i=1;i<=n;i++){
            num[i]=num[i-1]+nums[i-1];
        }
    }
    public int sumRange(int left, int right) {
        return num[right+1]-num[left];
    }
}