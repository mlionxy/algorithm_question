import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

class leetcode21 {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if(l1==null)return l2;
        if(l2==null)return l1;
        ListNode ans=null;
        if(l1.val<l2.val){
            ans=l1;
            l1=l1.next;
        }else{
            ans=l2;
            l2=l2.next;
        }
        ListNode root=ans;
        while(l1!=null&&l2!=null){
            if(l1.val<l2.val){
                root.next=l1;
                l1=l1.next;
                root=root.next;
            }   else{
                root.next=l2;
                l2=l2.next;
                root=root.next;
            }
        }
        if(l1==null)root.next=l2;
        else root.next=l1;
        return ans;
    }


}