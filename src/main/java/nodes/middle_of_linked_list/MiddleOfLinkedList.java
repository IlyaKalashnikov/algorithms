package nodes.middle_of_linked_list;

import nodes.ListNode;

/*
Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.
 */

public class MiddleOfLinkedList {
    public static ListNode middleNodeObviousMethod(ListNode head) {
        if(head==null){
            return head;
        }
        ListNode middleNode = head;
        int length = 1;
        while (head.next != null) {
            head = head.next;
            length +=1;
        }
        for (int i = 0; i < (int) Math.ceil(length/2); i++) {
            middleNode = middleNode.next;
        }
        return middleNode;
    }

    public static ListNode middleNodeTwoPointers(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next!=null){
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }
}
