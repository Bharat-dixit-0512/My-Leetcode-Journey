class Solution {
    public int minLength(String s) {
        StringBuilder sb=new StringBuilder();
        for(char ch:s.toCharArray()){
            if(sb.length()>0 && sb.charAt(sb.length()-1)=='A' && ch=='B'){
                sb.deleteCharAt(sb.length()-1);
            }
            else if(sb.length()>0 && sb.charAt(sb.length()-1)=='C' && ch=='D') sb.deleteCharAt(sb.length()-1);
            else sb.append(ch);
        }
        return sb.length();
    }
}