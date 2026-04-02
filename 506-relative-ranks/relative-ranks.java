class Solution {
    public String[] findRelativeRanks(int[] score) {
        
        String[]result=new String[score.length];

        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<score.length;i++){
            map.put(score[i],i);
        }
        
        Arrays.sort(score);
        
        for (int i = 0; i < score.length / 2; i++) {
            int temp = score[i];
            score[i] = score[score.length - 1 - i];
            score[score.length - 1 - i] = temp;
        }

        for (int i=0;i<score.length;i++){
            int index=map.get(score[i]);
            if(i==0) result[index]="Gold Medal";
            else if(i==1) result[index]="Silver Medal";
            else if(i==2) result[index]="Bronze Medal";
            else result[index]=String.valueOf(i+1);
        }

        return result;
    }
}