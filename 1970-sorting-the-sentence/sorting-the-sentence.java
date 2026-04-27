class Solution {
    public String sortSentence(String s) {
        String[] arr = s.split("\\s+");
        int n = arr.length;
        String[] res = new String[n];
        for(int i=0; i<n; i++){
            String word = arr[i];
            int idx = word.charAt(word.length()-1)-'0'-1;
            String str = word.substring(0,word.length()-1);
            res[idx] = str;
        }
        return String.join(" ", res);

    }
}