class Solution {
    private int dp[];
    public int tribonacci(int n) {
        dp=new int[n+1];
        Arrays.fill(dp,-1);
        return ans(n);
    }
    public int ans(int n){
        if(n==0)return 0;
        if(n<=2)return 1;
        if(dp[n]!=-1)return dp[n];
        dp[n]=ans(n-1)+ans(n-2)+ans(n-3);
        return dp[n];
    }
}