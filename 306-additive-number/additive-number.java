class Solution {
    public boolean isAdditiveNumber(String num) {
        return back(num,0,0,0,0);
    }
    public boolean back(String num,int start,int count,long prev1,long prev2){
        if(start==num.length()){
            return count>=3;
        }
        long curr=0;
        for(int i=start;i<num.length();i++){
            if(i>start && num.charAt(start)=='0')break;
            curr=curr*10+(num.charAt(i)-'0');
            if(count>=2){
                long sum=prev1+prev2;
                if(curr<sum)continue;
                if(curr>sum)break;
            }
            if(back(num,i+1,count+1,prev2,curr))return true;
        }
        return false;
    }
}