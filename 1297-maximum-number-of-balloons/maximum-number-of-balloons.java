class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> fre=new HashMap<>();
        
        for(char ch:text.toCharArray()){
            if(ballon(ch)){
                fre.put(ch,fre.getOrDefault(ch,0)+1);
            }
        }
        
        int min=Integer.MAX_VALUE;
        min=Math.min(min,fre.getOrDefault('b',0));
        min=Math.min(min,fre.getOrDefault('a',0));
        min=Math.min(min,fre.getOrDefault('l',0)/2);
        min=Math.min(min,fre.getOrDefault('o',0)/2);
        min=Math.min(min,fre.getOrDefault('n',0));
        
        return min;
    }
    
    boolean ballon(char ch){
        return ch=='b'||ch=='a'||ch=='l'||ch=='o'||ch=='n';
    }
}
