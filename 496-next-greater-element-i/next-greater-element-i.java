class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int ans[] = new int[nums1.length];
        List<Integer> arr = new ArrayList<>();
        for (int num : nums2) {
            arr.add(num);
        }
        Arrays.fill(ans,-1);
        for (int i = 0; i < nums1.length; i++) {
            int leftP = arr.indexOf(nums1[i]);
            for (int j = leftP + 1; j < nums2.length; j++) {
                if (nums2[j] > nums1[i]) {
                    ans[i] = nums2[j];
                    break;
                }
            }
        }
        return ans;
    }
}