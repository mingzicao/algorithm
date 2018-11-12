package LinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CycleNodeInLinkedListTest {
    CycleNodeInLinkedList cll = new CycleNodeInLinkedList();

    @Test
    void cycleNode() {
        ListNode n = ListNode.buildLinkedListFromArray(new int[] {1,2,3,4,5,6,7,8});
        ListNode begin = n;
        while (begin.value != 4)  {
            begin = begin.next;
        }
        ListNode tail = begin;
        while (tail.value != 8)  {
            tail = tail.next;
        }
        tail.next = begin;
        ListNode result = cll.cycleNode(n);
        assertEquals(begin.value, result.value);

    }
}