package nodes.linked_list_cycle_test;

import static org.assertj.core.api.Assertions.*;

import nodes.linked_list_cycle.LinkedListCycle;
import nodes.ListNode;
import org.junit.jupiter.api.Test;

class LinkedListCycleTest {
    ListNode cycledHead = new ListNode(1);
    ListNode node1 = new ListNode(2);
    ListNode node2 = new ListNode(3);
    ListNode node3 = new ListNode(4);
    ListNode node4 = new ListNode(5);

    @Test
    void hasCycle() {
        cycledHead.nextNode(node1);
        node1.nextNode(node2);
        node2.nextNode(node3);
        node3.nextNode(node4);
        node4.nextNode(node3);

        boolean actual = LinkedListCycle.hasCycle(cycledHead);

        assertThat(actual).isEqualTo(true);
    }

    @Test
    void hasNotCycle(){
        cycledHead.nextNode(node1);
        node1.nextNode(node2);
        node2.nextNode(node3);
        node3.nextNode(node4);

        boolean actual = LinkedListCycle.hasCycle(cycledHead);

        assertThat(actual).isEqualTo(false);
    }

}