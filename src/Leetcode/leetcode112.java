class leetcode112 {

    //递归
    //时间复杂度：O(N)，N是树的节点
    //空间复杂度：O(H)，H是树的高度
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null){
            return false; // 为空退出
        }

        // 叶子节点判断是否符合
        if (root.left == null && root.right == null){
            return root.val == targetSum;
        }
        // 求两侧分支的路径和
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
}