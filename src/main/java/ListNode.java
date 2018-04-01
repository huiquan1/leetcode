public class ListNode {

    int val;

    public ListNode getNext() {
        return next;
    }

    public ListNode setNext(ListNode next) {
        this.next = next;
        return this.next;
    }

    private ListNode next;

    ListNode(int x) {
        val = x;
    }
}
