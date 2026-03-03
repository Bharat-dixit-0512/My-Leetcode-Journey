class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=Integer.MIN_VALUE;
        for(int num:piles)
            max=Math.max(num,max);
        long left=1,right=max,k=max;
        while(left<=right){
            long mid=left+(right-left)/2;
            long hrs=hours(piles,mid);
            if(hrs>h)left=mid+1;
            else{
                k=mid;
                right=mid-1;
            }
        }
        return (int)k;
    }
    public long hours(int[] piles,long k){
        long hrs=0;
        for(int i=0;i<piles.length;i++)
            hrs+=(long)Math.ceil((double)piles[i]/k);
        return hrs;
    }
}