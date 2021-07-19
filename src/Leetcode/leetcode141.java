import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class leetcode141 {

    //遍历所有节点，判断节点是否之前被访问过
    //用hash表存入节点，如果hash表中已有该节点，说明是环形链表
    //时间复杂度O(N),空间复杂度O(N)
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<ListNode>();
        while(head != null){
            if(!set.add(head)){
                return true;
            }
            head = head.next;
        }
        return false;
    }
}