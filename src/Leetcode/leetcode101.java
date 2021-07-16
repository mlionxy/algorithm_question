class leetcode101 {

    //树的左子树等于右子树代表镜像对称
    //时间复杂度O(n)，空间复杂度O(n)
    public boolean isSymmetric(TreeNode root) {
        return check(root,root);
    }

    public boolean check(TreeNode p,TreeNode q){
        if(p == null && q == null){
            return true;
        }else if(p == null || q == null){
            return false;
        }else if(p.val == q.val){
            return check(p.left,q.right) && check(p.right,q.left);
        }else{
            return false;
        }
    }

}