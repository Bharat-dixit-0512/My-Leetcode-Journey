class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> brackets=new Stack<>();
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                if (brackets.size() > 0) {
                    sb.append('(');
                }
                brackets.push('(');
            } else {
                brackets.pop();
                if (brackets.size() > 0) {
                    sb.append(')');
                }
            }
        }
        return sb.toString();
    }
}