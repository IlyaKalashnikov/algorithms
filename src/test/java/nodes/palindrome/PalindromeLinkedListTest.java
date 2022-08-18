package nodes.palindrome;

import nodes.ListNode;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class PalindromeLinkedListTest {
    ListNode head = new ListNode(1);
    ListNode node1 = new ListNode(2);
    ListNode node2 = new ListNode(3);
    ListNode node3 = new ListNode(3);
    ListNode node4 = new ListNode(2);
    ListNode node5 = new ListNode(1);

    @Test
    void isPalindromeWithList() {

        head.nextNode(node1);
        node1.nextNode(node2);
        node2.nextNode(node3);
        node3.nextNode(node4);
        node4.nextNode(node5);

        boolean actual = PalindromeLinkedList.isPalindromeWithList(head);

        assertThat(actual).isEqualTo(true);
    }

    @Test
    void isPalindromeReverseList(){
        head.nextNode(node1);
        node1.nextNode(node2);
        node2.nextNode(node3);
        node3.nextNode(node4);
        node4.nextNode(node5);

        boolean actual = PalindromeLinkedList.isPalindromeReverseList(head);

        assertThat(actual).isTrue();
    }

    @Test
    void isPalindromReverseListWithLonaHead(){
        boolean actual = PalindromeLinkedList.isPalindromeReverseList(head);

        assertThat(actual).isTrue();
    }

    @Test
    void isPalindromeReverseListWithBadList(){
        head.nextNode(node1);
        node1.nextNode(node2);

        boolean actual = PalindromeLinkedList.isPalindromeReverseList(head);

        assertThat(actual).isFalse();
    }

    @Test
    void isPalindromeReverseListWithHeadNull(){
        ListNode nullHead = null;

        boolean actual = PalindromeLinkedList.isPalindromeReverseList(nullHead);

        assertThat(actual).isFalse();
    }
}