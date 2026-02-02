package java_practice;

public class ReorderList {

     public void reorderList(ListNode head) {
        ListNode fast = head, slow = head;
        while(fast!=null && fast.next!=null){
            fast = fast.next.next;
            slow = slow.next;
        }

        // reverse the linked list starting with slow
        ListNode prev = null, cur = slow.next;
        slow.next = null;
        while(cur!=null){
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        // combine
        ListNode start2 = prev, start1 = head;
        while(start2!=null){
            ListNode next1 = start1.next, next2 = start2.next;
            start1.next = start2;
            start2.next = next1;
            start1 = next1;
            start2 = next2;
        }
        
    }

    public static void main(String[] args) {
        ReorderList solver = new ReorderList();
        ListNode n1 = new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

        solver.reorderList(n1);

        while(n1!=null){
            System.out.println(n1.val + ">>");
            n1 = n1.next;
        }

    }
}
