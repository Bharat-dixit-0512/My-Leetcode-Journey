class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int[] input = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            input[i] = nums[i % n];
        }
        int[] result = new int[n];
        Arrays.fill(result, -1);
        Stack<Integer> st = new Stack<>();
        for (int i = input.length - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= input[i]) {
                st.pop();
            }
            if (i < n && !st.isEmpty()) {
                result[i] = st.peek();
            }
            st.push(input[i]);
        }
        return result;
    }
}