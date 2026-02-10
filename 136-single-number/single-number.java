class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        int uniqueSum=0;
        int sumAll=0;
        for(int i:nums ){
            if(!set.contains(i)){
                set.add(i);
                uniqueSum+=i;
            }
            sumAll+=i;
        }
        return 2* uniqueSum-sumAll;
    }
}