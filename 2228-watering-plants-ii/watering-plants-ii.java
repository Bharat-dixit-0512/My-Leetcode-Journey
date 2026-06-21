class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int left = 0, right = plants.length - 1;
        int x = capacityA, y = capacityB;
        int refill = 0;
        while (left < right) {
            if (plants[left] <= capacityA) {
                capacityA -= plants[left];
            } else {
                refill++;
                capacityA = x-plants[left];
            }
            left++;
            if (plants[right] <= capacityB) {
                capacityB -= plants[right];
            } else {
                refill++;
                capacityB = y-plants[right];
            }
            right--;
        }
        if (left == right) {
            if (capacityA >= capacityB) {
                if (plants[left] > capacityA) {
                    refill++;
                }
            } else {
                if (plants[right] > capacityB) {
                    refill++;
                }
            }
        }
        return refill;
    }
}