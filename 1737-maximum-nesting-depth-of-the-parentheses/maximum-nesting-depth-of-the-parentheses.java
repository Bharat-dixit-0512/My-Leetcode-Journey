class Solution {
    public int maxDepth(String s) {
        Stack<Character> stack=new Stack<>();
        int size=0;
        int max=0;
        int start=0;
        while(start<s.length()){
            char ch=s.charAt(start);
            if(ch=='('){
                stack.push(ch);
                start++;
            }
            else if(ch==')'){
                max=Math.max(max,stack.size());
                stack.pop();
                start++;
            }
            else{
                start++;
            }
        }
        return max;
    }
}