package leetcode;

public class reverse_linked_list {
    public ListNode reverseList(ListNode head){
        if(head == null || head.next==null){
            return head;
        }
        ListNode pre,temp;
        pre = null;
        while(head != null){
            temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return pre;
    }
}
