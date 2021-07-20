class leetcode226 {

    //递归遍历，从叶子节点开始翻转
    //时间复杂度O(N),空间复杂度O(N)
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);
        root.left = right;
        root.right = left;
        return root;
    }

}