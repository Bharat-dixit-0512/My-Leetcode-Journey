class Solution {
    public String decodeString(String s) {
        Stack<String> strStack = new Stack<>();
        Stack<Integer> numStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int num = 0;

        for (char ch : s.toCharArray()) {
            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0'); 
            } else if (ch == '[') {
                numStack.push(num);
                strStack.push(current.toString());
                num = 0;
                current = new StringBuilder();
            } else if (ch == ']') {
                int repeat = numStack.pop();
                StringBuilder temp = new StringBuilder(strStack.pop());
                for (int i = 0; i < repeat; i++) {
                    temp.append(current);
                }
                current = temp;
            } else {
                current.append(ch);
            }
        }
        return current.toString();
    }
}