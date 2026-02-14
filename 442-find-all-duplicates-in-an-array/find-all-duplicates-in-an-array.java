class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        ArrayList<Integer> list=new ArrayList<>();
        for(int i:nums){
            if(!set.contains(i)){
                set.add(i);
            }else{
                list.add(i);
            }
        }
        return list;
    }
}