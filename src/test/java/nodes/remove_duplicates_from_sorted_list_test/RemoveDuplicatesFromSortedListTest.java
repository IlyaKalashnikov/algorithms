package nodes.remove_duplicates_from_sorted_list_test;

import nodes.ListNode;
import nodes.remove_duplicates_from_sorted_list.RemoveDuplicatesFromSortedList;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RemoveDuplicatesFromSortedListTest {

    @Test
    void removeDuplicates() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);

        head.nextNode(node1);
        node1.nextNode(node2);

        ListNode actual = RemoveDuplicatesFromSortedList.removeDuplicates(head);

        assertThat(actual.val).isEqualTo(1);
        assertThat(actual.next.val).isEqualTo(2);
    }

    @Test
    void removeDuplicatesWithTwoEqualNodes(){
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(1);

        head.nextNode(node1);

        ListNode actual = RemoveDuplicatesFromSortedList.removeDuplicates(head);

        assertThat(actual.val).isEqualTo(1);
        assertThat(actual.next).isNull();
    }
}