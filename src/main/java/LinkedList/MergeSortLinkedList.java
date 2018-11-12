package LinkedList;

import LinkedList.ListNode;
// Time: o(nlogn)
public class MergeSortLinkedList {
    public ListNode mergeSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        // at least two node;
        ListNode tail = findTail(head);
        return mergeSort(head, tail);
    }
    public ListNode findTail(ListNode head) {
        ListNode tail = head;
        while (tail.next != null) {
            tail = tail.next;
        }
        return tail;
    }
    public ListNode mergeSort(ListNode head, ListNode tail) {
        // base case; if only one node
        if ( head.next == null) {
            return head;
        }
        // n1 -> n2 -> n3
        //  h    m     t
        ListNode mid = findMiddle(head,tail); // n2 //O(n)
        ListNode midNext = mid.next; // n3
        mid.next = null;
        ListNode h1 = mergeSort(head, mid);// n1-> n2->null
        ListNode h2 = mergeSort(midNext, tail); // n3 -> null
        return merge(h1, h2); // O(N)
    }
    public ListNode merge (ListNode h1, ListNode h2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        ListNode i = h1; // n1-> n2 -> null
        ListNode j = h2;  // h1' s tail = h2; // n3  -> null
        while (i != null && j != null) {
            if (i.value < j.value) {
                cur.next = i;
                i = i.next;
            } else {
                cur.next = j;
                j = j.next;
            }
            cur = cur.next;
        }
        if (i != null) {
            cur.next = i;
        }
        if (j != null) {
            cur.next = j;
        }
        return dummy.next;
    }
    public ListNode findMiddle(ListNode head, ListNode tail) {
        // define mid
        // n1               mid = n1
        // n1 -> n2         mid = n1
        // n1 -> n2 -> n3   mid = n2
        ListNode slow = head;
        ListNode fast = head;
        while (fast != tail && fast.next != tail) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
}
