
package LinkedList;
/*
Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)      Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
* */
// time : O(n)
// space: O(1)

public class AddTwoNumbers {
    public ListNode addTwo(ListNode n1, ListNode n2) {
        //  ListNode n1 = reverse(l1);
        // ListNode n2 = reverse(l2);
        ListNode.printLinkedList(n1);
        ListNode.printLinkedList(n2);
        ListNode i = n1;
        ListNode j = n2;
        int carryon = 0;
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (i != null && j != null) {
            int x = i.value + j.value + carryon;
            carryon = x/10;
            int digit = x%10;
            cur.next = new ListNode(digit);
            cur = cur.next;
            i = i.next;
            j = j.next;
        }
        while (i !=  null){
            int x = i.value + carryon;
            carryon = x/10;
            int digit = x%10;
            cur.next = new ListNode(digit);
            cur = cur.next;
            i = i.next;
        }
        while (j !=  null){
            int x = j.value + carryon;
            carryon = x/10;
            int digit = x%10;
            cur.next = new ListNode(digit);
            cur = cur.next;
            j = j.next;
        }
        if (carryon != 0) {
            cur.next = new ListNode(carryon);
            cur = cur.next;
        }
        return dummy.next;

    }

    public ListNode reverse(ListNode n) {
        if( n == null || n.next == null) {
            return n;
        }
        ListNode cur = n;
        ListNode prev = null;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
}
