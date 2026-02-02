package java_practice;

public class SwapNodesinPairs {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;

        // prev
        ListNode prev = dummy;
        ListNode cur = head;

        while (cur != null && cur.next != null) {
            ListNode first = cur;
            ListNode second = cur.next;
            System.out.println("second>>>" + second.val);
            ListNode next = second.next;

            prev.next = second;
            second.next = first;
            first.next = next;

            prev = first;
            cur = next;
        }

        return dummy.next;

    }

    private void print(ListNode head) {
        ListNode cur = head;
        StringBuilder sb = new StringBuilder();
        while (cur != null) {
            sb.append(cur.val).append("->");
            cur = cur.next;
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        // ListNode node3 = new ListNode(3);
        // ListNode node4 = new ListNode(4);
        node1.next = node2;
        // node2.next = node3;
        // node3.next = node4;

        SwapNodesinPairs solver = new SwapNodesinPairs();
        solver.print(node1);
        // solver.swapPairs(node1);
        solver.print(solver.swapPairs(node1));

    }

}
