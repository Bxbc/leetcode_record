package leetcode;

public class remove_nth_node_from_end_of_list {
    public ListNode removeNthFromEnd(ListNode head,int n){
        ListNode pseudohead = new ListNode(-1);
        pseudohead.next = head;
        ListNode first;
        ListNode second;
        first = pseudohead;
        second = pseudohead;
        int cur = 0;
        while(cur<n){
            cur++;
            second = second.next;
        }
        while(second.next!=null){
            first = first.next;         // first always points to the node would be deleted;
            second = second.next;
        }
        first.next = first.next.next;
        return pseudohead.next;
    }
}
