class Solution {
    public boolean lemonadeChange(int[] bills) {
        int c10=0;
        int c5=0;
        for(int i:bills){
            if(i==5){
                c5++;
            }
            else if(i==10 && c5>0){
                c5--;
                c10++;
            }
            else if(i==20 && (c5>2 || (c10>0 && c5>0))){
                if(c10>0){
                    c10--;
                    c5--;
                }
                else{
                    c5-=3;
                }
            }
            else{
                return false;
            } 
        } 
        return true;
    }
}