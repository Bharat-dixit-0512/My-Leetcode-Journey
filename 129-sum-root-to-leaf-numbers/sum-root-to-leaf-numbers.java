 class Solution {
    public int sumNumbers(TreeNode root) {
        return count(root, 0);
    }
    public int count(TreeNode root, int num) {
        if (root == null)return 0;
        num = num * 10 + root.val;
        if (root.left == null && root.right == null) return num;
        return count(root.left, num) + count(root.right, num);
    }
}