package Tree;
import Array.MaxOfKSlidingWindow;

import java.util.*;
public class KClosestInBST {
    class MyComparator implements Comparator<TreeNode>   {
        double target;
        public MyComparator (double target) {
            this.target = target;
        }
        @Override
        public int compare(TreeNode t1, TreeNode t2) {
            double i1 = Math.abs(t1.key - target);
            double i2 = Math.abs(t2.key - target);
            if (i1 == i2 ) {
                return 0;
            }
            return i1 > i2 ? -1 : 1;
        }
    }
    public int[] closestKValuesHeap(TreeNode root, double target, int k) {
        PriorityQueue<TreeNode> maxHeap = new PriorityQueue<>(new MyComparator(target));
        traverse(root,  maxHeap,k, target);
        int[] result = new int[maxHeap.size()];
        int i = 0;
        while (!maxHeap.isEmpty()) {
            result[i++] = maxHeap.poll().key;
        }
        Arrays.sort(result);
        return result;
    }

    private void traverse(TreeNode root, PriorityQueue<TreeNode> maxHeap, int k, double target) {
        if (root == null) {
            return ;
        }
        traverse(root.left, maxHeap, k, target);
        if (maxHeap.size() < k) {
            maxHeap.offer(root);
        } else {
           if ( Math.abs(root.key - target) < Math.abs(maxHeap.peek().key - target)) {
               maxHeap.poll();
               maxHeap.offer(root);
           }
        }
        traverse(root.right, maxHeap, k, target);
    }


    public int[] closestKValues(TreeNode root, double target, int k) {
        List<Integer> list = new ArrayList<>();
        traverse(root, list);
        k = Math.min(k, list.size());
        int[] result = new int[k];
        findKClose(list, target, result);
        Arrays.sort(result);
        return result;
    }
    private void findKClose(List<Integer>  list, double target, int[] array) {
        int l = 0;
        int r = list.size() -1;
        int index = 0;
        while (l < r-1) {
            int mid = l + (r - l)/2;
            if (list.get(mid) == target) {
                l = mid;
                break;
            } else if (list.get(mid) < target) {
                l = mid;
            } else {
                r = mid;
            }
        }
        if (Math.abs(list.get(l) - target) <= Math.abs(list.get(r)- target)) {
            index = l;
        } else {
            index = r;
        }
        int i = 0;
        int left = index;
        int right = index+1;
        while (i < array.length) {
            if (left >= 0 && right < list.size()) {
                array[i++] = Math.abs(list.get(left) - target) <= Math.abs(list.get(right)- target) ? list.get(left--) : list.get(right++);
            } else if (left >= 0) {
                array[i++] = list.get(left--);
            } else {
                array[i++] = list.get(right++);
            }
        }
        return;
    }
    private void traverse(TreeNode root, List<Integer> list) {
        if (root == null) {
            return ;
        }
        traverse(root.left, list);
        list.add(root.key);
        traverse(root.right, list);
    }
}
