class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int count=baskets.length;
        for(int i=0;i<fruits.length;i++){
            int value=fruits[i];
            for(int j=0;j<baskets.length;j++){
                if(value<=baskets[j] ){
                    baskets[j]=0;
                    count--;
                    break;
                }
            }
        }
        return count;
    }
}