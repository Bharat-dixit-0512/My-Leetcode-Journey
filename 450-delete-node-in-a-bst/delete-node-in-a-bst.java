class Solution {
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root==null)return null;
        else if(root.val>key) root.left=deleteNode(root.left,key);
        else if(root.val<key)root.right=deleteNode(root.right,key);
        else{
            if(root.left==null && root.right==null)return null;
            else if(root.left==null)return root.right;
            else if(root.right==null)return root.left;
            else{
                int min=getMax(root.right);
                root.val=min;
                root.right=deleteNode(root.right,min);
            }
        }
        return root;
    }
    int getMax(TreeNode root){
        if(root.left==null)return root.val;
        return getMax(root.left);
    }
}