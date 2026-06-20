class Solution {
    public int reverseDegree(String s) {
        int sum=0;
        for(int i=1;i<s.length()+1;i++){
            char ch=s.charAt(i-1);
            sum+=(('z'-ch+1)*i);
        }
        return sum;
    }
}