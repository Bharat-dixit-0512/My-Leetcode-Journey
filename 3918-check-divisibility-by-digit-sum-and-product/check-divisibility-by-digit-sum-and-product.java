class Solution {
    public boolean checkDivisibility(int n) {
        int sum=0;
        int product=1;
        int x=n;
        while(x!=0){
            int rem=x%10;
            sum+=rem;
            product*=rem;
            x/=10;
        }
        int total = sum + product;
        return total != 0 && n % total == 0;
    }
}