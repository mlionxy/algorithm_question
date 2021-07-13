import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class leetcode103 {

    //时间复杂度O(N)
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        if(root == null){return result;}

        Queue<TreeNode> myQueue = new LinkedList<TreeNode>();
        myQueue.offer(root);//将树添加到队列里

        int level = 0;
        while(!myQueue.isEmpty()){
            Deque<Integer> curDeque = new LinkedList<Integer>();
            int curSize = myQueue.size();
            for(int i = 0; i < curSize; i++){
                TreeNode curNode = myQueue.poll();
                if(level % 2 == 0){
                    //从左往右
                    curDeque.offerLast(curNode.val);
                }
                else{
                    //从右往左
                    curDeque.offerFirst(curNode.val);
                }
                if(curNode.left != null){
                    myQueue.offer(curNode.left);
                }
                if(curNode.right != null){
                    myQueue.offer(curNode.right);
                }
            }
            result.add(new LinkedList<Integer>(curDeque));
            level += 1;
        }
        return result;
    }

}