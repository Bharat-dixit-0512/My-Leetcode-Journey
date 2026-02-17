class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        boolean flag[]=new boolean[baskets.length];
        int count=flag.length;
        Arrays.fill(flag,false);
        for(int i=0;i<flag.length;i++){
            int value=fruits[i];
            for(int j=0;j<baskets.length;j++){
                if(value<=baskets[j] && flag[j]==false){
                    flag[j]=true;
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}