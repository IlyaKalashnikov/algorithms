package nodes.remove_by_val_test;

import nodes.ListNode;
import nodes.remove_by_val.RemoveNodeByVal;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RemoveNodeByValTest {

    ListNode head = new ListNode(3);
    ListNode node1 = new ListNode(3);
    ListNode node2 = new ListNode(3);
    ListNode node3 = new ListNode(3);

    @Test
    void removeNodeByValWithEqualVals() {
        head.nextNode(node1);
        node1.nextNode(node2);
        node2.nextNode(node3);

        ListNode actual = RemoveNodeByVal.removeNodeByValObviousSolution(head, 3);
        assertThat(actual).isNull();
    }

    @Test
    void removeNodeByValWith2Elems(){
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);

        head.nextNode(node1);

        ListNode actual = RemoveNodeByVal.removeNodeByValObviousSolution(head, 2);

        assertThat(actual.next).isNull();
    }

    @Test
    void removeNodeByVal(){
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(2);
        ListNode tail = new ListNode(1);

        head.nextNode(node1);
        node1.nextNode(node2);
        node2.nextNode(tail);

        ListNode actual = RemoveNodeByVal.removeNodeByValObviousSolution(head, 2);

        assertThat(actual.next.val).isEqualTo(1);
    }

    @Test
    void removeNodeByValWithRecursion(){
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(2);
        ListNode tail = new ListNode(1);

        head.nextNode(node1);
        node1.nextNode(node2);
        node2.nextNode(tail);

        ListNode actual = RemoveNodeByVal.removeNodeByValWithRecursion(head,2);

        assertThat(actual.next.val).isEqualTo(1);
    }

    @Test
    void removeNodeByValWithOneNodeToDelete(){
        ListNode head = new ListNode(1);

        ListNode actual = RemoveNodeByVal.removeNodeByValObviousSolution(head, 1);
        assertThat(actual).isEqualTo(null);
    }
}