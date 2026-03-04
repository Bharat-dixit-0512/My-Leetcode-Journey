class Solution {
    public int totalFruit(int[] fruits) {
        int[] fr=new int[100007];
        int max=0;
        int type=0;
        int start=0;
        for(int i=0;i<fruits.length;i++){
            int f=fruits[i];
            if(fr[f]==0)type++;
            fr[f]++;
            while(type>2){
                fr[fruits[start]]--;
                if(fr[fruits[start]]==0)type--;
                start++;
            }
            max=Math.max(max,i-start+1);
        }
        return max;
    }
}