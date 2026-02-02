package java_practice;


// NOTE: 喜极而泣中😭😭😭 自己十分钟做出了medium

public class ReorderInternalList {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode cur = dummy;
        // left - 1
        for(int i = 0; i < left -1 ; i++){
            cur = cur.next;
        }
        ListNode leftbefore = cur;
        // left
        ListNode leftNode = cur.next;
        // break!
        leftbefore.next = null;

        // reverse List
        ListNode prev = null;
        cur = leftNode;

        for(int i = 0; i < right - left + 1; i++){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }

        // right
        ListNode rightNode = prev;
        // right + 1
        ListNode rightNext = cur;

        // reconnect
        leftbefore.next = rightNode;
        leftNode.next = rightNext;

        return dummy.next;
        
    }


    private void print(ListNode head){
        ListNode cur = head;
        StringBuilder sb  = new StringBuilder();
        while(cur!=null){
            sb.append(cur.val).append("->");
            cur = cur.next;
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        ReorderInternalList solver = new ReorderInternalList();

        //create testcase
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next =n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        solver.print(n1);
        solver.reverseBetween(n1, 2, 4);
        solver.print(n1);

    }
    
}
