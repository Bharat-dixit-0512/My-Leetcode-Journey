class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {
        int n = words.length;
        int minRight = Integer.MAX_VALUE;
        int minLeft = Integer.MAX_VALUE;
        for (int i = startIndex; i < startIndex + n; i++) {
            if (words[i % n].equals(target)) {
                minRight = Math.min(minRight, i - startIndex);
            }
        }
        for (int i = startIndex + n; i > startIndex; i--) {
            if (words[i % n].equals(target)) {
                minLeft = Math.min(minLeft, (startIndex + n - i));
            }
        }
        int ans = Math.min(minLeft, minRight);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
