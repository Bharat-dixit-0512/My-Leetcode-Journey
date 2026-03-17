class Solution {
    private static final int INT_MAX = Integer.MAX_VALUE; 
    private static final int INT_MIN = Integer.MIN_VALUE;

    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        int sign = 1;
        int start = 0;

        if (s.charAt(0) == '-') {
            sign = -1;
            start = 1;
        } else if (s.charAt(0) == '+') {
            start = 1;
        } else if (Character.isLetter(s.charAt(0))) {
            return 0;
        }

        return helper(s, start, 0, sign);
    }

    private int helper(String s, int i, int current, int sign) {
        if (i >= s.length()) return current * sign;

        char c = s.charAt(i);

        if (Character.isDigit(c)) {
            int digit = c - '0';
            if (current > (INT_MAX - digit) / 10) {
                return (sign == 1) ? INT_MAX : INT_MIN;
            }

            current = current * 10 + digit;
            return helper(s, i + 1, current, sign);
        } else {
            return current * sign;
        }
    }
}