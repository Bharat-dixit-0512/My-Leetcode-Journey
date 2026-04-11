class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int n = citations.length;
        int h = 0;
        while(h < n && citations[n - h - 1] >= h + 1) {
            h++;
        }
        return h;
    }
}