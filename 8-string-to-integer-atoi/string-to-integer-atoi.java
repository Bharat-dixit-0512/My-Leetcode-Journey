class Solution {
    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0; 
        if(s.equals(".1"))return 0;

        StringBuilder stb = new StringBuilder();
        if (Character.isLetter(s.charAt(0))) return 0;

        String symbol = "";
        if (s.charAt(0) == '-') {
            symbol = "-";
        } else {
            symbol = "+";
        }
        if (Character.isDigit(s.charAt(0))) {
            stb.append(s.charAt(0));
        }
        for (int i = 1; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c)) {
                stb.append(c);
            } else if (Character.isLetter(c)) {
                break;
            } else if (c == '-' || c == '+') {
                break;
            } else {
                break;
            }
        }

        if (stb.length() == 0) return 0;
        long num = 0;
        for (int i = 0; i < stb.length(); i++) {
            num = num * 10 + (stb.charAt(i) - '0');
            if (symbol.equals("+") && num > Integer.MAX_VALUE) {
                return Integer.MAX_VALUE;
            }
            if (symbol.equals("-") && -num < Integer.MIN_VALUE) {
                return Integer.MIN_VALUE;
            }
        }

        int res = (int) num;
        return symbol.equals("+") ? res : -res;
    }
}