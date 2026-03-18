class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int result[] = new int[m + n];
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                result[k] = nums1[i];
                i++;
                k++;
            } else {
                result[k] = nums2[j];
                k++;
                j++;
            }
        }
        while (i < m) {
            result[k] = nums1[i];
            i++;
            k++;

        }
        while (j < n) {
            result[k] = nums2[j];
            j++;
            k++;
        }
        if (k % 2 != 0) {
            k =k/2;
            return (double) result[k];
        } else {
            return ((double) result[k / 2 - 1] + (double) result[k / 2]) / 2.0;
        }

    }
}