package leetcode;

class add_two_numbers {
    public ListNode addTwoNumbers(ListNode l1,ListNode l2) {
        int num1,num2,carry;
        ListNode head1,head2,result,move;
        result = new ListNode(0);
        move = result;
        head1 = l1;
        head2 = l2;
        carry = 0;
        while(head1!=null || head2!=null || carry !=0){
            num1 = 0;
            num2 = 0;
            if(head1!=null){
                num1 = head1.val;
                head1 = head1.next;
            }
            if(head2!=null){
                num2 = head2.val;
                head2 = head2.next;
            }
            ListNode a = new ListNode((num1+num2+carry)%10);
            move.next = a;
            move = move.next;
            if(num1+num2+carry>=10){
                carry = 1;
            }else{carry = 0;}
        }
        return result.next;
    }
}
