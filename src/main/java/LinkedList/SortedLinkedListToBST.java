package LinkedList;

import Tree.TreeNode;

public class SortedLinkedListToBST {
    public TreeNode sortedListToBST(ListNode head) {
        if (head == null) {return null;}
        return convert(head);

    }
    private TreeNode convert(ListNode n) {
        if (n == null) {
            return null;
        }
        if (n.next == null) {
            return new TreeNode(n.value);
        }
        // at least two nodes
        //              1  ->  2
        //pre =null    mid
        ListNode[] preMid = findPreMid(n);
        TreeNode root = new TreeNode(preMid[1].value);
        ListNode secondHalf = preMid[1] == null ? null : preMid[1].next;
        root.right  = convert(secondHalf);

        if (preMid[0] != null) {
            preMid[0].next = null;
            root.left = convert(n);
        } else {
            root.left = null;
        }
        return root;
    }

    private ListNode[] findPreMid(ListNode n) {
        ListNode prev = null;
        ListNode slow = n;
        ListNode fast = n.next;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        return new ListNode[] {prev, slow};
    }
}
