class Solution {
    public int bitwiseComplement(int n) {
         if (n == 0) return 1;
        StringBuilder sb=new StringBuilder();
        int x=0;
        while(n!=0){
            x=n%2;
            sb.append(x);
            n/=2;
        }
        sb.reverse();
        String str=sb.toString();
        StringBuilder comp=new StringBuilder();
        for(char ch:str.toCharArray()){
            if(ch=='0')comp.append("1");
            else comp.append("0");
        }

        return Integer.parseInt(comp.toString(),2);
    }
}