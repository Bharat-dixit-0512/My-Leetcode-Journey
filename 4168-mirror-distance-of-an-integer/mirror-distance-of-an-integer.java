class Solution {
    public int mirrorDistance(int n) {
        int x=reverse(n);
        return Math.abs(n-x);
    }
    public int reverse(int n){
        int res=0;
        while(n!=0){
            res=res*10+n%10;
            n/=10;
        }
        return res;
    }
}