class Solution {
    public String toHex(int num) {
        if (num == 0) return "0";
        char[] s = "0123456789abcdef".toCharArray();
        StringBuilder sb = new StringBuilder();
        
        while (num != 0) {
            int rem = num & 15;//behaves num%16 but faster and also work for negative values
            sb.append(s[rem]);
            num >>>= 4; //it behaves like num/=4
        }
        return sb.reverse().toString();
    }
}
