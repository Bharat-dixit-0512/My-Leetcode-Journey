class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> set=new HashSet<>();
        int min=Integer.MAX_VALUE,max=0;
        for(int i=0;i<nums.length;i++){
            min=Math.min(nums[i],min);
            max=Math.max(nums[i],max);
            set.add(nums[i]);
        }
        List<Integer> l=new ArrayList<>();
        for(int i=min;i<max;i++){
            if(!set.contains(i))l.add(i);
        }
        return l;
    }
}