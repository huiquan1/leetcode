/**
 * you are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * You may assume the two numbers do not contain any leading zero, except the number 0 itself.
 * <p>
 * Example
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * Explanation: 342 + 465 = 807.
 */
public class AddTwoNumber {
    private ListNode add(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null) {
            return carry == 0 ? null : new ListNode(carry);
        }
        if (l1 == null && l2 != null) {
            l1 = new ListNode(0);
        }
        if (l2 == null && l1 != null) {
            l2 = new ListNode(0);
        }
        int sum = l1.val + l2.val + carry;
        ListNode curr = new ListNode(sum % 10);
        curr.setNext(add(l1.getNext(), l2.getNext(), sum / 10));
        return curr;
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return add(l1, l2, 0);
    }

}
