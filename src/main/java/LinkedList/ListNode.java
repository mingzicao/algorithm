package LinkedList;

public class ListNode {
    public int value;
    public ListNode next;
    public ListNode(int value) {
        this.value = value;
    }
    public static ListNode buildLinkedListFromArray(int[] array) {
        ListNode head = new ListNode(0);
        ListNode cur = head;
        for (int i : array) {
            cur.next = new ListNode(i);
            cur = cur.next;
        }
        return head.next;
    }
    public static void printLinkedList(ListNode n) {
        while (n != null) {
            System.out.print(n.value + " ");
            n = n.next;
        }
        System.out.println();
    }

}
