class Solution {
    public boolean judgeSquareSum(int c) {
        //pehle Nearest sq. root value find kro c ki 
        //then 0 se uss value tkk ke answer tkk binary search apply kro
        //agr sum chota aata toh left pointer increment kro
        //otherwise right pointer decrement kro 
        //agr equal hojaye toh true
        //agr true na aaye toh false;


        if(c<0)return false;

        long left=0;
        long right=(int)Math.sqrt(c);
        while(left<=right){
            long sum=left*left+right*right;
            if(sum<c){
                left++;
            }else if(sum>c){
                right--;
            }
            else{
                return true;
            }
        }
        return false;
    }
}