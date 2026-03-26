class Solution {
    public long gcdSum(int[] nums) {
        int n=nums.length;
        long[] prefixGcd=new long[n];
        int maxi=-1;
        for(int i=0;i<n;i++){
            maxi=Math.max(maxi,nums[i]);
            prefixGcd[i]=gcd(maxi,nums[i]);
        }

        Arrays.sort(prefixGcd);
        int l=0,r=n-1;
        long ans=0;
        while(l<r){
            ans+=gcd(prefixGcd[l],prefixGcd[r]);
            l++;
            r--;
        }
        return ans;
    }
    public long gcd(long a,long b){
        if(b==0)return a;
        return gcd(b,a%b);
    }
}