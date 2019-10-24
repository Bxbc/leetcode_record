package leetcode;

class palindrome_linked_list {
    public boolean isPalindrome(ListNode head) {
        ListNode pre,temp,fast,slow;
        fast = head;
        slow = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        pre = null;
        fast = slow;
        while(fast!=null){
            temp = fast.next;
            fast.next = pre;
            pre = fast;
            fast = temp;
        }
        fast = head;
        while(pre!=null){
            if(head.val !=pre.val){
                return false;
            }
            head = head.next;
            pre = pre.next;
        }
        return true;
    }
}
