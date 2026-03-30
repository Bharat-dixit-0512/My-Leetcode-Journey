class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length())return false;
        StringBuilder sb=new StringBuilder();
        sb.append(s).append(s);
        return sb.toString().contains(goal);
    }
}