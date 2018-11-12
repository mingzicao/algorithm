package LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortLinkedListTest {
    public QuickSortLinkedList qs = new QuickSortLinkedList();


    @Test
    void quickSort() {
        ListNode n = ListNode.buildLinkedListFromArray(new int[] {1});
        ListNode out  = qs.quickSort(n);
        ListNode.printLinkedList(out);
    }

    @Test
    void quickSort2() {
        ListNode n = ListNode.buildLinkedListFromArray(new int[] {9, 1});
        ListNode out  = qs.quickSort(n);
        ListNode.printLinkedList(out);
    }
    @Test
    void quickSort3() {
        ListNode n = ListNode.buildLinkedListFromArray(new int[] {1,2,9,5,3});
        ListNode out  = qs.quickSort(n);
        ListNode.printLinkedList(out);
    }
}