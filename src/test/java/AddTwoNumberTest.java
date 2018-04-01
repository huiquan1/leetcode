import org.junit.Test;

import static org.junit.Assert.*;

public class AddTwoNumberTest {
    @Test
    public void add() throws Exception {
        ListNode listNode = new ListNode(2);
        listNode.setNext(new ListNode(4)).setNext(new ListNode(3));
        ListNode listNode2 = new ListNode(5);
        listNode2.setNext(new ListNode(6)).setNext(new ListNode(4));
        ListNode res = new AddTwoNumber().addTwoNumbers(listNode, listNode2);

        assertEquals(7, res.val);
        assertEquals(0, res.getNext().val);
        assertEquals(8, res.getNext().getNext().val);
    }

}