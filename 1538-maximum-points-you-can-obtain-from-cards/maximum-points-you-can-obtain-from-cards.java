class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n = cardPoints.length;
        int total = 0;
        for(int i=0;i<n;i++){
            total+=cardPoints[i];
        }
        if(n==k)return total;

        int windowSize = n-k;
        int sum=0,min=Integer.MAX_VALUE,start=0;
        for(int end=0;end<n;end++){
            sum+=cardPoints[end];
            if(end<windowSize-1)continue;
            min=Math.min(min,sum);
            sum-=cardPoints[start++];
        }

        return total-min;
    }
}