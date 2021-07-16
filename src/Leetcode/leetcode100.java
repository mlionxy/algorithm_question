import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class leetcode100 {

    //如果都为null则相同，一个为null一个不为null则false，
    //当两个都不为null但是值不相等则false
    //时间复杂度O(n)，空间复杂度O(n)
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }else if(p == null || q == null){
            return false;
        }else if(p.val != q.val){
            return false;
        }else{
            return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
        }
    }

}