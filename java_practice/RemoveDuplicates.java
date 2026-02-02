package java_practice;

public class RemoveDuplicates {

    public ListNode deleteDuplicates(ListNode head) {

        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        // prev
        ListNode cur = head, prev = dummy;

        while (cur != null && cur.next != null) {
            if (cur.val == cur.next.val) {
                while (cur.next != null && cur.val == cur.next.val) {
                    cur = cur.next;
                }
                ListNode next = cur.next;
                prev.next = next;
                cur = cur.next;
            } else {
                cur = cur.next;
                prev = prev.next;
            }

        }

        return dummy.next;
    }

    public ListNode convertToLinkedList(int[] arr) {
        ListNode dummy = new ListNode(-1);
        ListNode cur = dummy;
        for (int num : arr) {
            ListNode node = new ListNode(num);
            cur.next = node;
            cur = node;
        }
        return dummy.next;
    }

    public void print(ListNode head) {
        ListNode cur = head;
        StringBuilder sb = new StringBuilder();
        while (cur != null) {
            sb.append(cur.val).append("->");
            cur = cur.next;
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        RemoveDuplicates solver = new RemoveDuplicates();

        ListNode head = solver.convertToLinkedList(new int[] { 1, 2, 3, 3, 4, 4, 5 });

        solver.print(solver.deleteDuplicates(head));
    }

}
