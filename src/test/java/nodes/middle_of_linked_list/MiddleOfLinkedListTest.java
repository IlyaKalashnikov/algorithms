package nodes.middle_of_linked_list;

import nodes.ListNode;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class MiddleOfLinkedListTest {

    ListNode head = new ListNode(1);
    ListNode node1 = new ListNode(2);
    ListNode node2 = new ListNode(3);
    ListNode node3 = new ListNode(4);
    ListNode node4 = new ListNode(5);
    ListNode node5 = new ListNode(6);

    @Test
    void middleNode_withOddList() {
        head.nextNode(node1);
        node1.nextNode(node2);
        node2.nextNode(node3);
        node3.nextNode(node4);

        ListNode actual = MiddleOfLinkedList.middleNodeObviousMethod(head);

        assertThat(actual).isSameAs(node2);
    }

    @Test
    void middleNode_withEvenList(){
        head.nextNode(node1);
        node1.nextNode(node2);
        node2.nextNode(node3);
        node3.nextNode(node4);
        node4.nextNode(node5);

        ListNode actual = MiddleOfLinkedList.middleNodeObviousMethod(head);
        ListNode actual1 = MiddleOfLinkedList.middleNodeTwoPointers(head);

        assertThat(actual).isSameAs(node3);
        assertThat(actual1).isSameAs(node3);
    }

    @Test
    void middleNode_with2NodesList(){
        head.nextNode(node1);

        ListNode actual = MiddleOfLinkedList.middleNodeObviousMethod(head);
        ListNode actual1 = MiddleOfLinkedList.middleNodeTwoPointers(head);

        assertThat(actual).isSameAs(node1);
        assertThat(actual).isSameAs(node1);
    }

    @Test
    void middleNode_withHeadNull(){
        ListNode head = null;

        ListNode actual = MiddleOfLinkedList.middleNodeObviousMethod(head);
        ListNode actual1 = MiddleOfLinkedList.middleNodeTwoPointers(head);

        assertThat(actual).isNull();
        assertThat(actual1).isNull();
    }
}