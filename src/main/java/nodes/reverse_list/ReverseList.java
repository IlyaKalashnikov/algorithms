package nodes.reverse_list;

import nodes.ListNode;

public class ReverseList {
    public static ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        head = reverseRecursion(head, null);
        return head;
    }

    public static ListNode reverseRecursion(ListNode head, ListNode prev) {
        if (head.next == null) {
            head.next = prev;
            return head;
        }
        ListNode next = head.next;
        head.next = prev;
        return reverseRecursion(next, head);
    }
}
