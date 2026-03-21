class Solution {
    public int maxDepth(String s) {
        int count=0;
        int max=0;
        int start=0;
        while(start<s.length()){
            char ch=s.charAt(start);
            if(ch=='('){
                count++;
                start++;
            }
            else if(ch==')'){
                max=Math.max(max,count);
                count--;
                start++;
            }
            else{
                start++;
            }
        }
        return max;
    }
}