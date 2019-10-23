package leetcode;


// create a new linked list to merge two lists
class merge_two_sorted_lists {
    public ListNode mergeTwoLists(ListNode l1,ListNode l2){
        if(l1==null){
            return l2;
        }
        if(l2==null){
            return l1;
        }
        ListNode pre,cur1,cur2,head;
        head = new ListNode(-1);
        pre = head;
        cur1 = l1;
        cur2 = l2;
        while(cur1 != null && cur2 != null){
            if(cur1.val <= cur2.val){
                pre.next = cur1;
                cur1 = cur1.next;
            }else{
                pre.next = cur2;
                cur2 = cur2.next;
            }
            pre = pre.next;
        }
        if(cur1 != null) pre.next = cur1;
        if(cur2 != null) pre.next = cur2;
        return head.next;
    }
}

// according to the answer of other people try to use recursion to solve it
class merge_two_sorted_lists_recur {
    public ListNode mergeTwoListsrecur(ListNode l1,ListNode l2) {
        if(l1==null) return l2;
        if(l2==null) return l1;
        if(l1.val<=l2.val){
            l1.next = mergeTwoListsrecur(l1.next,l2);
            return l1;
        }else{
            l2.next = mergeTwoListsrecur(l2.next,l1);
            return l2;
        }
    }
}