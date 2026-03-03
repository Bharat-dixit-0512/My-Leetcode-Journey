class Solution {
    public List<Integer> findAnagrams(String s2, String p) {
        List<Integer> list =new ArrayList<>();
        int f1[]=new int[26];
        for(char ch:p.toCharArray()){
            f1[ch-'a']++;
        }
        int k=p.length();
        int f2[]=new int[26];
        for(int i=0;i<s2.length();i++){
            char ch=s2.charAt(i);
            f2[ch-'a']++;
            if(i<k-1)continue;
            if(Arrays.equals(f1,f2))list.add(i-k+1);
            int sidx=i-(k-1);
            char r=s2.charAt(sidx);
            f2[r-'a']--;
        }  
        return list;
    }
}