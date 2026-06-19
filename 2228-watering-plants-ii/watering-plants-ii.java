class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int n = plants.length;
        int refill = 0;
        int left = 0, right = n - 1;
        int currA = capacityA, currB = capacityB;
        while (left < right) {
            if (plants[left] > currA) {
                refill++;
                currA = capacityA;
            }
            currA -= plants[left];
            left++;
            if (plants[right] > currB) {
                refill++;
                currB = capacityB;
            }
            currB -= plants[right];
            right--;
        }
        if (left == right) {
            if (currA >= currB) {
                if (plants[left] > currA) refill++;
            } else {
                if (plants[right] > currB) refill++;
            }
        }
        return refill;
    }
}