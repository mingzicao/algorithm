package Stack;

import java.util.LinkedList;

public class SortBy3Stack {
    public void sort(LinkedList<Integer> s1) {
        LinkedList<Integer> small = new LinkedList<Integer>(); //  small  || 1 2 3
        LinkedList<Integer> large = new LinkedList<Integer>(); //  large  || 9 9 7
        // result  || 9 9 7 3 2 1
        if (s1.size() <= 1) {                                  //  input  || 3 2 7 1 9 9
            return;
        }
        int i1 = s1.pollFirst();
        int i2 = s1.pollFirst();
        small.offerFirst(Math.min(i1,i2));
        large.offerFirst(Math.max(i2, i1));
        while (!s1.isEmpty()) {
            int cur = s1.pollFirst();
            if (cur <= small.peekFirst()) {
                while (!small.isEmpty() && small.peekFirst() > cur ) {
                    large.offerFirst(small.pollFirst());
                }
                small.offerFirst(cur);
            } else {
                while (!large.isEmpty() && cur > large.peekFirst()) {
                    small.offerFirst(large.pollFirst());
                }
                large.offerFirst(cur);
            }
        }
        while (!large.isEmpty()) {
            small.offerFirst(large.pollFirst());
        }
        while (!small.isEmpty()) {
            s1.offerFirst(small.pollFirst());
        }
        return;
    }
}
