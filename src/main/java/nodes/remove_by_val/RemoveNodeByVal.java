package nodes.remove_by_val;

import nodes.ListNode;


/*
Given the head of a linked list and an integer val,
remove all the nodes of the linked list that has Node.val == val, and return the new head.
 */
public class RemoveNodeByVal {
    public static ListNode removeNodeByValObviousSolution(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        while (head.val == val){
            if (head.next == null){
                return null;
            }
            head = head.next;
        }
        ListNode prev = head;
        ListNode iter = head;
        while (iter != null) {
            if (iter.val != val){
                if (iter == head){
                    iter = iter.next;
                    continue;
                }
                prev.next = iter;
                prev = prev.next;
                iter = iter.next;
                continue;
            }
            prev.next = null;
            iter = iter.next;
        }
        return head;
    }

    public static ListNode removeNodeByValWithRecursion(ListNode head, int val){
        if (head == null){
            return null;
        }
        head.next = removeNodeByValWithRecursion(head.next,val);
        return head.val == val? head.next:head;
    }
}
