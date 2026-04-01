class Solution {
    public int leastInterval(char[] tasks, int n) {
        int[] freq = new int[26];
        int maxFreq = 0;
        for(char ch:tasks){
            int idx = ch - 'A';
            freq[idx]++;
            if(freq[idx] > maxFreq){
                maxFreq = freq[idx];
            }
        }

        int numFreq = 0;

        for(int i=0; i<26; i++){
            if(freq[i]==maxFreq) numFreq++;
        }

        int gapCount = maxFreq - 1;
        int partLength = n+1;
        int res = gapCount*partLength + numFreq;

        return Math.max(res, tasks.length);
    }
}