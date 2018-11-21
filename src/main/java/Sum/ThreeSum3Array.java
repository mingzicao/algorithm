package Sum;
import java.util.*;
/**
 * Given three arrays, determine if a set can be made by
 * picking one element from each array that sums to the given target number.
 *
 * assumption:
 * arrays are not sorted;
 * 1 worst case
 * so we have to enumerate all the possible combination to see if exist;
 * brute force: a*b*c.length time complexity
 *
 * length : if a length ~ b length  <<  c size, we can enumerate the all possible combine of two
 * shorter array, and match the last one in O(C.length), and we need O(a*b) space and O(C) time;
 * complexity
 *
 * 2. if we can sort the three array first;
 * 3O(nlogn);
 * and use bfs to see if the target,
 * **/
public class ThreeSum3Array {
    public boolean exist(int[] a, int[] b, int[] c, int target) {
        int[] t = null;
        if (a.length > b.length && a.length > c.length) {
            t = c;
            c = a;
            a = t;
        }
        if (b.length > a.length && b.length > c.length) {
            t = c;
            c = b;
            b = t;
        }
        // make sure the c is the largest array;
        Set<Integer> ab  = new HashSet<>();
        for (int i : a) {
            for (int j : b) {
                ab.add(i+j);
            }
        }
        for (int i : c) {
            if (ab.contains(target - i)) {
                return true;
            }
        }
        return false;
    }


}
