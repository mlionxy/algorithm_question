import java.util.ArrayList;
import java.util.List;

class leetcode234 {

    //双指针法，将链表中值赋值到数组中，使用双指针法判断是否回文
    //时间复杂读O(N)，空间复杂度O(N)
    public boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<Integer>();
        //将链表中的值赋给数组中
        ListNode node = head;
        while(node != null){
            vals.add(node.val);
            node = node.next;
        }
        //使用双指针法判断数组中数据是否回文
        int first = 0;
        int end = vals.size()-1;
        while(first < end){
            if(!vals.get(first).equals(vals.get(end))){
                return false;
            }
            first++;
            end--;
        }
        return true;
    }
}