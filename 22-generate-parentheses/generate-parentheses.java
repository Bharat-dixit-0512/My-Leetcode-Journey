class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), 0, 0, n);
        return result;
    }
    private void backtrack(List<String> result, StringBuilder current, int opening, int closing, int n) {
        if (current.length() == 2 * n) {
            result.add(current.toString());
            return;
        }
        if (opening < n) {
            current.append('(');
            backtrack(result, current, opening + 1, closing, n);
            current.deleteCharAt(current.length() - 1);
        }
        if (closing < opening) {
            current.append(')');
            backtrack(result, current, opening, closing + 1, n);
            current.deleteCharAt(current.length() - 1);
        }
    }
}