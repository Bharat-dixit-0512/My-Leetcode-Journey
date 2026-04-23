class Solution {
    public long[] distance(int[] nums) {
       long[] res = new long[nums.length];
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
        }
        Map<Integer, long[]> prefix = new HashMap<>();
        for (Map.Entry<Integer, List<Integer>> e : map.entrySet()) {
            List<Integer> list = e.getValue();
            long[] pre = new long[list.size() + 1];
            for (int i = 0; i < list.size(); i++) {
                pre[i + 1] = pre[i] + list.get(i);
            }
            prefix.put(e.getKey(), pre);
        }
        for (int i = 0; i < nums.length; i++) {
            List<Integer> list = map.get(nums[i]);
            long[] pre = prefix.get(nums[i]);
            int idx = Collections.binarySearch(list, i);
            if (idx < 0) idx = -idx - 1;
            long left = (long) i * idx - pre[idx];
            long right = (pre[list.size()] - pre[idx]) - (long) i * (list.size() - idx);
            res[i] = left + right;
        }
        return res;
    }
}
