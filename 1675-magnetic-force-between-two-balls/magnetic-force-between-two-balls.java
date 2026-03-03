class Solution {
    public int maxDistance(int[] stalls, int k) {
        Arrays.sort(stalls);
        int left = 1;
        int max = stalls[stalls.length - 1] - stalls[0];
        int ans = -1;
        // for(int d=1;d<=max;d++){
        //     int c=placeCows(stalls,d);
        //     if(c>=k){
        //         ans=d;
        //     }else break;
        // }

        while (left <= max) {
            int mid = left + (max - left) / 2;
            int count = placeCows(stalls, mid);
            if (count >= k) {
                ans = mid;
                left = mid + 1;

            } else {
                max = mid - 1;
            }

        }
        return ans;

    }

    public int placeCows(int[] stalls, int dist) {
        //initialize the count is 1 default
        int count = 1;
        //initially place the first cow at index 1 as default
        int place = stalls[0];
        //initialize loop from 2nd position mean 1st index of an array
        for (int i = 1; i < stalls.length; i++) {
            //agar stall index aur place difference bda h distance se then increase count and change the place with stalls i;
            if (stalls[i] - place >= dist) {
                count++;
                place = stalls[i];
            }
        }
        return count;
    }
}
