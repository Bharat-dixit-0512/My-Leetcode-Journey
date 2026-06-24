 class Solution {
    int sum=0;
    public int sumNumbers(TreeNode root) {
        count(root, 0);
        return sum;
    }
    public void count(TreeNode root, int num) {
        if (root == null)return;
        num = num * 10 + root.val;
        if (root.left == null && root.right == null){
            sum+=num;
            return;
        }
        count(root.left, num);
         count(root.right, num);
    }
}