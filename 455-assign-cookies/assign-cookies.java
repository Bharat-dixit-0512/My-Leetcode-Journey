class Solution {
    public int findContentChildren(int[] greed, int[] size) {
        int n=greed.length;
        int m=size.length;
        Arrays.sort(greed);
        Arrays.sort(size);
        int left=0;
        int right=0;
        while(left<m && right<n){
            if(greed[right]<=size[left]){
                right++;
            }
            left++;
        }
        return right;
    }
}