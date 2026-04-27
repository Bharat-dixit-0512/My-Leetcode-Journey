class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        fun(result,"", 0, 0, n);
        return result;
    }
    private void fun(List<String> result,String s, int open, int close, int n) {
        if (s.length() == 2 * n) {
            result.add(s);
            return;
        }
        if (open < n) {
            fun(result,s+"(",open+1,close,n);
        }
        if (close < open) {
            fun(result, s+")", open, close + 1, n);
        }
    }
}