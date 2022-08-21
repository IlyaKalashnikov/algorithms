package nodes.reverse_list;

import nodes.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ReverseListTest {

    @Test
    void reverseList() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);

        head.nextNode(node1);
        node1.nextNode(node2);
        node2.nextNode(node3);
        node3.nextNode(node4);

        ListNode actual = ReverseList.reverseList(head);

        assertThat(actual.val).isEqualTo(5);
    }

    @Test
    void reverseListWithNullHead() {
        ListNode head = null;

        ListNode actual = ReverseList.reverseList(head);

        assertThat(actual).isNull();
    }

    @Test
    void reverseListWithHeadNextNull(){
        ListNode head = new ListNode(1);

        ListNode actual = ReverseList.reverseList(head);

        assertThat(actual).isNotNull();
        assertThat(actual.next).isNull();
    }
}