package LinkedList;

import java.util.LinkedList;

// find the mid of the linkedlist,
// reverse a half;
// and compare if they are the same;
//  1  ->  3  ->  1        mid = 3 compare(1 ->  3)   reverse(1 -> 3) // idd number
//  1  -> 3‘ ->  3 -> 1    mid = 3 compera(1 ->  3’)   reverse(mid.next = 3 -> 1)
public class LinkedListPalindrom {
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null ) {
            return true;
        }
        int[] size = new int[]{0};
        ListNode mid = findMid(head, size);
        ListNode h2 = null;
        if (size[0] % 2 != 0) {
            // 1 -> 2 -> 2 -> null
            //     mid
            h2 = reverse(head, mid);
            return compare(mid.next, h2);
        }
        h2 = reverse(head, mid);
        return compare(mid, h2);
    }
    private ListNode reverse(ListNode head, ListNode mid) {
        if (head == mid || head.next == mid) {
            head.next = null;
            return head;
        }
        ListNode prev = null;
        ListNode cur = head;
        while (cur != mid ) { // cur == mid
            ListNode next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        return prev;
    }
    private ListNode findMid(ListNode head, int[] size) {
        ListNode fast = head;
        ListNode mid = head;
        while (fast != null && fast.next != null) {
            mid = mid.next;
            fast = fast.next.next;
            size[0] +=2;
        }
        if (fast != null) {
            size[0]++;
        }
        return mid;
    }
    public boolean compare(ListNode h1, ListNode h2) {
        while (h1!= null && h2 != null) {
            if (h1.value != h2.value) {
                return false;
            }
            h1 = h1.next;
            h2 = h2.next;
        }
        if (h1 == null && h2 == null) {
            return true;
        }
        return false;
    }
}
