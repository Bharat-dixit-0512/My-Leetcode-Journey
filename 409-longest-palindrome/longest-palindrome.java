class Solution {
    public int longestPalindrome(String s) {
       int arr[]=new int[123];
       for(char ch: s.toCharArray())
        arr[ch]++;
        int ans=0;
        int odd=0;
        for(int i=65;i<123;i++){
            if(arr[i]%2==0){
                ans+=arr[i];
            }else{
                ans+=arr[i]-1;
                odd=1;
            }if(i==90){
                i=96;
            
        }
       } 
       return ans+odd;
    }
}