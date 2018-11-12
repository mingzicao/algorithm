package LinkedList;

public class QuickSortLinkedList {

    public ListNode quickSort(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode[] result = quickSort1(head); // return the new sorted LinkedList head and tail;
        return result[0];
    }

    private ListNode[] quickSort1(ListNode head) {
        if (head == null || head.next == null) {
            return new ListNode[]{head, head};
        }
        ListNode dummyLarge = new ListNode (0);
        ListNode i = dummyLarge;
        ListNode dummySmall = new ListNode (0);
        ListNode j = dummySmall;
        int pivot = head.value;
        ListNode cur = head.next;
        head.next = null;
        while (cur != null) {
            if (cur.value > pivot) {
                i.next = cur;
                i = i.next;
            } else {  // cur value <= pivot
                j.next = cur;
                j = j.next;
            }
            cur = cur.next;
        }
        i.next = null;
        j.next = null;

        ListNode[] list1 = quickSort1(dummySmall.next); // Small head, tail [null null]
        ListNode[] list2 = quickSort1(dummyLarge.next); // Large head, tail
        if (list1[0] == null) {  // smaller half is null;
            head.next = list2[0];
            return new ListNode[] {head, list2[1]};
        }
        if (list2[0] == null) { // large half is null
            list1[1].next = head;
            return new ListNode[] {list1[0], head};
        }
        list1[1].next = head;
        head.next = list2[0];
        return new ListNode[] {list1[0], list2[1]};
    }
}
