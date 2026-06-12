class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        Collections.sort(list);
        return list.get(k - 1);
    }
    void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        list.add(root.val);
        inorder(root.left, list);
        inorder(root.right, list);
    }
}
