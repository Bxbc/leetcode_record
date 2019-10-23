package leetcode;

import org.jetbrains.annotations.Contract;

public class ListNode {
    int val;
    ListNode next;
    ListNode(int x){val = x;}
}

class printLink {
    public static void prints(ListNode head){
        ListNode cur = head;
        while(cur != null){
            System.out.print(cur.val);
            System.out.print(" ");
            cur = cur.next;
        }
        System.out.println();
    }
}