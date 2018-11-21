package LinkedList;

import Tree.TreeNode;
import Tree.Tree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortedLinkedListToBSTTest {
    SortedLinkedListToBST sll = new SortedLinkedListToBST();

    @Test
    void sortedListToBST() {
        ListNode n = ListNode.buildLinkedListFromArray(new int[] {1,2});
        TreeNode r = sll.sortedListToBST(n);
        Tree.PrintTreeLevelOrder(r);

    }
}