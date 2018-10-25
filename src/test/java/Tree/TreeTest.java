package Tree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {


    @Test
    void buildTreeLevelAndInOrder() {
        int[] inOrder = new int[] {4,2,5,1,6,3,7};
        int[] levelOrder = new int [] {1,2,3,4,5,6,7};
        TreeNode root = Tree.buildTreeLevelAndInOrder(levelOrder, inOrder);
        List<Integer> l = Tree.levelOrderTraversal(root);
        int[] actual = new int[l.size()] ;
        for (int i = 0; i < l.size(); i++) {
            actual[i] = l.get(i);
        }
        int[] array = new int [] {1,2,3,4,5,6,7};
        assertArrayEquals(actual,array);
    }

    @Test
    void buildTreeLevelAndInOrder2() {
        int[] inOrder = new int[] {2,1,3};
        int[] levelOrder = new int [] {1,2,3};
        TreeNode root = Tree.buildTreeLevelAndInOrder(levelOrder, inOrder);
        List<Integer> l = Tree.levelOrderTraversal(root);
        int[] actual = new int[l.size()] ;
        for (int i = 0; i < l.size(); i++) {
            actual[i] = l.get(i);
        }
        int[] level = new int [] {1,2,3};

        assertArrayEquals(actual,level);
    }

    @Test
    void buildTreeLevelAndInOrder3() {
        int[] inOrder = new int[] {2,1};
        int[] levelOrder = new int [] {1,2};
        TreeNode root = Tree.buildTreeLevelAndInOrder(levelOrder, inOrder);
        List<Integer> l = Tree.levelOrderTraversal(root);
        int[] actual = new int[l.size()] ;
        for (int i = 0; i < l.size(); i++) {
            actual[i] = l.get(i);
        }
        int[] array = new int [] {1,2};
        assertArrayEquals(actual,array);
    }

    @Test
    void makeIndexMap() {
        int[] inOrder = new int[] {4,2,5,1,6,3,7};
        Map<Integer, Integer> idx = Tree.makeIndexMap(inOrder);

        // using for-each loop for iteration over Map.entrySet()
        for (Map.Entry<Integer, Integer> entry : idx.entrySet())
            System.out.println("Key = " + entry.getKey() +
                    ", Value = " + entry.getValue());
    }

    @Test
    void levelOrderTraversal() {
        TreeNode n1 = new TreeNode(1);
        n1.left = new TreeNode(2);
        n1.right = new TreeNode(3);
        n1.left.left = new TreeNode(4);
        n1.left.right = new TreeNode(5);
        n1.right.right= new TreeNode(7);
        n1.right.left = new TreeNode(6);
        List<Integer> l =  Tree.levelOrderTraversal(n1);
        int[] actual = new int[l.size()] ;
        for (int i = 0; i < l.size(); i++) {
            actual[i] = l.get(i);
        }
        int[] array = new int [] {1,2,3,4,5,6,7};
        assertArrayEquals(actual,actual);
    }
}