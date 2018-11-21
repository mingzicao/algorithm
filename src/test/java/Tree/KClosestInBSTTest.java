package Tree;

import BFS1.KSmallesrWith23Factor;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KClosestInBSTTest {

    KClosestInBST kbs = new KClosestInBST();
    @Test
    void closestKValues() {
        TreeNode root = Tree.buildTreeLevelAndInOrder(new int[] {5,3,11,2,4,6,12,1}, new int[] {1,2,3,4,5,6,11,12});
        int[] result = kbs.closestKValues(root, 4,3);
        for (int i : result) {
            System.out.print(i+ " ");
        }
    }


    @Test
    void closestKValues1() {
        TreeNode root = Tree.buildTreeLevelAndInOrder(new int[] {8,5,10,3,7,9,1,4,6,2}, new int[] {1,2,3,4,5,6,7,8,9,10});
        int[] result = kbs.closestKValues(root, 4,3);
        for (int i : result) {
            System.out.print(i+ " ");
        }
    }
    //{"8","5","10","3","7","9","#","1","4","6","#","#","#","#","2"}), 100.0, 100
}