class Solution {
    public int[] singleNumber(int[] nums) {
        int n=nums.length;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int ans[]=new int[2];
        int j=0;
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            if(entry.getValue()==1 && j<ans.length){
                ans[j]=entry.getKey();
                j++;
            }
        }
        return ans;
    }
}