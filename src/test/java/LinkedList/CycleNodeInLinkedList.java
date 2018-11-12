package LinkedList;
/**
 * Check if a given linked list has a cycle.
 * Return the node where the cycle starts.
 * Return null if there is no cycle.
 * */
public class CycleNodeInLinkedList {
    public ListNode cycleNode(ListNode head) {
      if (head == null || head.next == null) {
          return null;
      }
      ListNode slow = head;
      ListNode fast = head.next;
      while ( fast != slow) {
          if (fast.next == null && fast.next.next == null) {
              return null;
          }
          slow = slow.next;
          fast = fast.next.next;
      }

      slow = head;
      while (fast != slow.next) {
          slow = slow.next;
          fast = fast.next;
      }
      return slow;
    }
    //  Ds = vt  Df = 2vt+1
    //  m + N*n = m +


}
