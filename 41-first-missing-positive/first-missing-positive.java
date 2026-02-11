class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int max=0;
        for(int a:nums){
            if(a>0){
                set.add(a);
                max=Math.max(a,max);
            }
        }
        for(int i=1;i<=max;i++){
            if(!set.contains(i)){
                return i;
            }
        }
        return max+1;
    }
}