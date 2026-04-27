class Solution {
    public String sortSentence(String str) {
        String arr[]=str.split("\\s+");
        String res[]=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            String s=arr[i];
            if(s.charAt(s.length()-1)=='1'){
                res[0]=s.substring(0,s.length()-1);
            }
            if(s.charAt(s.length()-1)=='2'){
                res[1]=s.substring(0,s.length()-1);
            }
            if(s.charAt(s.length()-1)=='3'){
                res[2]=s.substring(0,s.length()-1);
            }
            if(s.charAt(s.length()-1)=='4'){
                res[3]=s.substring(0,s.length()-1);
            }
            if(s.charAt(s.length()-1)=='5'){
                res[4]=s.substring(0,s.length()-1);
            }
            if(s.charAt(s.length()-1)=='6'){
                res[5]=s.substring(0,s.length()-1);
            }
            if(s.charAt(s.length()-1)=='7'){
                res[6]=s.substring(0,s.length()-1);
            }
            if(s.charAt(s.length()-1)=='8'){
                res[7]=s.substring(0,s.length()-1);
            }
            if(s.charAt(s.length()-1)=='9'){
                res[8]=s.substring(0,s.length()-1);
            }
        }
        StringBuilder stb=new StringBuilder();
        for(String st:res){
            stb.append(st).append(" ");
        }
        return stb.toString().trim();
    }
}