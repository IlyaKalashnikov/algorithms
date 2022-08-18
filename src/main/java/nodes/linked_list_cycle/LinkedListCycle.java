package nodes.linked_list_cycle;

public class LinkedListCycle {

    public static boolean hasCycle(nodes.ListNode head) {
        nodes.ListNode fastPointer = head;
        nodes.ListNode slowPointer = head;
        while (fastPointer != null && fastPointer.next != null) {
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (fastPointer == slowPointer) {
                return true;
            }
        }
        return false;
    }
}

