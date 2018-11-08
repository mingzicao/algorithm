
package LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {
    private AddTwoNumbers ad = new AddTwoNumbers();
    @Test
    void reverse() {
        ListNode n = ListNode.buildLinkedListFromArray(new int[] {1,2,3,4});
        ListNode n1 = ad.reverse(n);
        ListNode.printLinkedList(n1);
    }

    @Test
    void addTwo() {
        /*
        Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
        Output: 7 -> 0 -> 8                 Explanation: 342 + 465 = 807.*/
        ListNode n1 = ListNode.buildLinkedListFromArray(new int[]{2,4,3});
        ListNode n2 = ListNode.buildLinkedListFromArray(new int[]{5,6,4});
        ListNode n3 = ad.addTwo(n1,n2);
        ListNode.printLinkedList(n3);
    }
    @Test
    void addTwo1() {
        // 1 + 999 = 1000
        ListNode n1 = ListNode.buildLinkedListFromArray(new int[]{1});
        ListNode n2 = ListNode.buildLinkedListFromArray(new int[]{9,9,9});
        ListNode n3 = ad.addTwo(n1,n2);
        ListNode.printLinkedList(n3);

    }
    @Test
    void addTwo2() {
        // 1 + 999 = 1000
        ListNode n1 = ListNode.buildLinkedListFromArray(new int[]{1, 3});
        ListNode n2 = ListNode.buildLinkedListFromArray(new int[]{2, 7});
        ListNode n3 = ad.addTwo(n1,n2);
        ListNode.printLinkedList(n3);
    }
}