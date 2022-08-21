package nodes.remove_duplicates_from_sorted_list;

/*
Given the head of a sorted linked list,
delete all duplicates such that each element appears only once.
Return the linked list sorted as well
 */

import nodes.ListNode;

public class RemoveDuplicatesFromSortedList {
    public static ListNode removeDuplicates(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        head.next = removeDups(head.next, head.val);
        return head;
    }

    public static ListNode removeDups (ListNode head, int val){
        if (head == null){
            return null;
        }
        head.next = removeDups(head.next, head.val);
        return head.val == val? head.next:head;
    }
}
