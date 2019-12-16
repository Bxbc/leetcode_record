package leetcode;

class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
}

class copy_list_with_random_pointer {
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        Node point = head.next;
        Node nhead = new Node();
        Node index = nhead;
        nhead.val = head.val;
        while(point!=null){         // clone the main branch
            Node temp = new Node();
            temp.val = point.val;
            point = point.next;
            index.next = temp;
            index = index.next;
        }
        index = head;
        point = nhead;
        Node rando;                 // use three pointers to link the random branches
        while(index!=null){
            if(index.random!=null){
                rando = nhead;
                while(rando.val != index.random.val && rando!=null){
                    rando = rando.next;
                }
                point.random = rando;
            }
            index = index.next;
            point = point.next;
        }
        return nhead;
    }
}
