class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> ans = new ArrayList<>();
        if(nums1.length == 0 || nums2.length == 0 || k == 0)
            return ans;
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a,b) -> (a[0] + a[1]) - (b[0] + b[1])
        );
        for(int i = 0; i < Math.min(nums1.length, k); i++){
            pq.offer(new int[]{nums1[i], nums2[0], 0});
        }
        while(k-- > 0 && !pq.isEmpty()){
            int[] curr = pq.poll();
            ans.add(Arrays.asList(curr[0], curr[1]));
            int idx = curr[2];
            if(idx + 1 < nums2.length){
                pq.offer(new int[]{
                    curr[0],
                    nums2[idx + 1],
                    idx + 1
                });
            }
        }
        return ans;
    }
}