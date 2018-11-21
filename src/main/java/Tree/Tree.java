package Tree;

import java.util.*;

public class Tree {
    public static TreeNode buildTreeLevelAndInOrder(int[] level, int [] in) {
        if (level== null || in== null || level.length == 0 || in.length == 0) {
            return null;
        }
        Map<Integer, Integer> indexMap = makeIndexMap(in);
        return buildTreeLevelAndInOrder(level,0, level.length-1, in, 0, in.length -1, indexMap);

    }
    private static TreeNode buildTreeLevelAndInOrder(int[] level, int ll, int lr, int[] in, int il, int ir, Map<Integer, Integer> map) {
        if (ll > lr) {
            return null;
        }
        if (ll == lr) {
            return new TreeNode(level[ll]);
        }

        TreeNode root = new TreeNode(level[0]);
        int rootIndex = map.get(level[0]);
        int leftSubTreeSize = rootIndex - il;
        int rightSubTreeSize = ir - rootIndex;
        int[] leftLevelOrder = new int[leftSubTreeSize];
        int[] rightLevelOrder = new int[rightSubTreeSize];
        int i = 0;
        int j = 0;
        for (int ii = ll+1; ii <= lr; ii++) {
            if (map.get(level[ii]) < rootIndex) {
                leftLevelOrder[i++] = level[ii];
            } else {
                rightLevelOrder[j++] = level[ii];
            }
        }
        root.left = buildTreeLevelAndInOrder(leftLevelOrder,0, leftLevelOrder.length-1, in, il, rootIndex-1, map);
        root.right = buildTreeLevelAndInOrder(rightLevelOrder,0,rightLevelOrder.length-1,in, rootIndex+1,ir, map);
        return root;

    }
    public static Map<Integer, Integer> makeIndexMap(int[] in) {
//        Map<int, int> map = new HashMap<int,int>();
        Map<Integer, Integer>map = new HashMap<>();
        for(int i = 0 ; i < in.length; i++) {
            map.put(in[i], i);
        }
        return map;
    }
    public static List<Integer> levelOrderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return list;
        }
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.offerLast(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = queue.pollFirst();
                list.add(cur.key);
                if (cur.left != null) {
                    queue.offerLast(cur.left);
                }
                if (cur.right != null) {
                    queue.offerLast(cur.right);
                }
            }
        }
        return list;
    }
    public static void PrintTreeLevelOrder(TreeNode root) {

        LinkedList<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return;
        }
        queue.offerLast(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size > 0) {
                TreeNode t = queue.pollFirst();
                System.out.print(t.key + " ");
                if (t.left != null) {
                    queue.offerLast(t.left);
                }
                if (t. right != null) {
                    queue.offerLast(t.right);
                }
                size--;
            }
            System.out.println();
        }

    }

}
