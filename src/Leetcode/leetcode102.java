import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class leetcode102 {
    //二叉树的层序遍历
    //广度优先搜索，遍历每一层的节点
    //时间复杂度O(n)，空间复杂度O(n)
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<List<Integer>>();
        if(root == null){
            return res;
        }

        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        //将根节点放入队列中，然后不断遍历
        queue.add(root);
        while (queue.size()>0){
            //获取当前队列长度，这个长度相当于当前层节点个数
            int size = queue.size();
            ArrayList<Integer> tmp = new ArrayList<Integer>();
            //将队列中元素拿出来放到tmp中
            //如果左右子树不为空 放入队列中
            for(int i = 0; i<size;++i){
                TreeNode treeNode = queue.remove();
                tmp.add(treeNode.val);
                if(treeNode.left!=null) {
                    queue.add(treeNode.left);
                }
                if(treeNode.right!=null) {
                    queue.add(treeNode.right);
                }
            }
            //将获取到的数据放入res中
            res.add(tmp);
        }
        return res;

    }



}