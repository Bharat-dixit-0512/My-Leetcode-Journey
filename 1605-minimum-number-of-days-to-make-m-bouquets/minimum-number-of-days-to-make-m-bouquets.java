class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long)m * k > bloomDay.length) return -1; 
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int day : bloomDay) {
            min = Math.min(min, day);
            max = Math.max(max, day);
        }
        int ans = -1;
        while (min <= max) {
            int mid = min + (max - min) / 2;
            if (possible(bloomDay, mid, m, k)) {
                ans = mid;
                max = mid - 1; 
            } else {
                min = mid + 1; 
            }
        }
        return ans;
    }
    public boolean possible(int[] arr, int day, int m, int k) {
        int count = 0, bouquets = 0;
        for (int val : arr) {
            if (val <= day) {
                count++;
                if (count == k) {
                    bouquets++;
                    count = 0;
                }
            } else {
                count = 0;
            }
        }
        return bouquets >= m;
    }
}