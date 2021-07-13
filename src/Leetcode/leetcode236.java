import java.util.HashMap;

class leetcode236 {

    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //当越过叶节点,则直接返回null,当root等于p,q,则直接返回root
        if(root == null || root == p || root == q) return root;
        //开启递归左子节点,返回值记为left
        TreeNode left = lowestCommonAncestor(root.left, p, q);
        //开启递归右子节点,返回值记为right
        TreeNode right = lowestCommonAncestor(root.right, p, q);
        if(left == null && right == null) return null; // 说明不包含p,q 返回null
        if(left == null) return right;//其中一个在右子树中，返回right
        if(right == null) return left;//其中一个在左子树中，返回left
        return root;//返回公共祖先 root

    }

}