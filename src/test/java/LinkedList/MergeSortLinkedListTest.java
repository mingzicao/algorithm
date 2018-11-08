package LinkedList;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MergeSortLinkedListTest {
    private MergeSortLinkedList ms = new MergeSortLinkedList();
    @Test
    void mergeSort() {
        int[] array = new int [] {5,4,6,7,1};
        ListNode h1 = ListNode.buildLinkedListFromArray(array);
        ListNode h2 = ms.mergeSort(h1);
        ListNode.printLinkedList(h2);

    }
    @Test
    void mergeSort1() {
        int[] array = new int [] {3,1};
        ListNode h1 = ListNode.buildLinkedListFromArray(array);
        ListNode h2 = ms.mergeSort(h1);
        ListNode.printLinkedList(h2);

    }
}