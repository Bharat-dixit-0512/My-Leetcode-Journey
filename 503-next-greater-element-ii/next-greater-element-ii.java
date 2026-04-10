class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int n=nums.length;
        int arr[]=new int[n];
        Arrays.fill(arr,-1);
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<2*n;i++){
            int ele=nums[i%n];
            while(!st.isEmpty() && nums[st.peek()]<ele){
                arr[st.pop()]=ele;
            }
            if(i<n){
                st.add(i);
            }
        }
        return arr;
    }
}