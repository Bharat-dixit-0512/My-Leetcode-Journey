class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int n = arrays.size();
        int res = 0;
        int minVal = arrays.get(0).get(0);
        int maxVal = arrays.get(0).get(arrays.get(0).size() - 1);
        for (int i = 1; i < n; i++) {
            List<Integer> arr = arrays.get(i);
            int curMin = arr.get(0);
            int curMax = arr.get(arr.size() - 1);

            res = Math.max(res, Math.abs(curMax - minVal));
            res = Math.max(res, Math.abs(maxVal - curMin));

            minVal = Math.min(minVal, curMin);
            maxVal = Math.max(maxVal, curMax);
        }

        return res;
    }
}
