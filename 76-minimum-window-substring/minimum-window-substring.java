class Solution {
    public String minWindow(String s, String t) {
        if(s.length()<t.length())return "";
        if(s.length()==t.length() && s.contains(t))return s;

        int[] need=new int[128];
        for(char c:t.toCharArray()){
            need[c]++;
        }
        int[] freq=new int[128];
        int count=0,start=0,minLen=Integer.MAX_VALUE,minStart=0;

        for(int end=0;end<s.length();end++){
            char c=s.charAt(end);
            freq[c]++;
            if(need[c]>0 && freq[c]<=need[c])count++;
            while(count==t.length()){
                if(end-start+1<minLen){
                    minLen=end-start+1;
                    minStart=start;
                }
                char left=s.charAt(start++);
                freq[left]--;
                if(need[left]>0 && freq[left]<need[left])count--;
            }
        }
        return minLen==Integer.MAX_VALUE?"":s.substring(minStart,minStart+minLen);
    }
}