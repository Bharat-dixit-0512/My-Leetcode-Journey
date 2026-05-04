class Solution {
    int[] nums;
    int[] copy;
    Random rand = new Random();
    public Solution(int[] nums) {
        this.nums = nums;
        copy = nums.clone();
    }
    public int[] reset() {
        nums = copy.clone();
        return nums;
    }
    public int[] shuffle() {
        int[] shuffled = nums.clone();
        for (int i = shuffled.length - 1; i > 0; i--) {
            int j = rand.nextInt(i + 1);
            int temp = shuffled[i];
            shuffled[i] = shuffled[j];
            shuffled[j] = temp;
        }
        return shuffled;
    }
}
