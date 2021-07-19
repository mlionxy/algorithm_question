import java.util.HashSet;
import java.util.Set;

class leetcode83 {
    //遍历链表，如果下一个节点的值与当前节点值相同，则删除下一个节点
    //时间复杂度O(N),空间复杂度O(1)
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        ListNode cur = head;
        while(cur.next != null){
            if(cur.val == cur.next.val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }

        return head;
    }
}