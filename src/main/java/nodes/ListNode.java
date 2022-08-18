package nodes;

public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
        next = null;
    }

    public void nextNode(ListNode nextNode) {
        this.next = nextNode;
    }
}
