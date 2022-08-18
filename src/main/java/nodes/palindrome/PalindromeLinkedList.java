package nodes.palindrome;

/*
Given the head of a singly linked list, return true if it is a palindrome.
 */

import nodes.ListNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PalindromeLinkedList {
    public static boolean isPalindromeWithList(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head, fast = head, temporary;
        List<Integer> palindromeList = new ArrayList<>();
        while (fast != null && fast.next != null) {
            palindromeList.add(slow.val);
            slow = slow.next;
            fast = fast.next.next;
        }
        if (fast != null) {
            palindromeList.add(slow.val);
        }
        Collections.reverse(palindromeList);
        for (int i = 0; i < palindromeList.size(); i++) {
            if (slow.val != palindromeList.get(i)) {
                return false;
            }
            slow = slow.next;
        }
        return true;
    }

    public static boolean isPalindromeReverseList(ListNode head) {
        if (head == null) {
            return false;
        }
        ListNode slow = head, fast = head, temporary, previous;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        previous = slow;
        slow = slow.next;
        previous.next = null;
        while (slow != null) {
            temporary = slow.next;
            slow.next = previous;
            previous = slow;
            slow = temporary;
        }
        slow = previous;
        fast = head;
        while (slow != null) {
            if(fast.val != slow.val){
                return false;
            }
            slow=slow.next;
            fast=fast.next;
        }
        return true;
    }
}
