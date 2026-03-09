class Solution {
    public int findMin(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int n:nums){
            set.add(n);
        }
        int min=Integer.MAX_VALUE;
        for(int n:set){
            if(n<min){
                min=n;
            }
        }
        return min;
    }
}