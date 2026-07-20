class Solution {
    public int[] countBits(int n) {
        int dp[]=new int[n+1];
        for(int i=0;i<=n;i++){

            dp[i]=count(i);
        }
        return dp;
    }
    int count(int n){
        int cnt=0;
        while(n!=0){
            cnt++;
            n&=(n-1);
        }
        return cnt;
    }
}