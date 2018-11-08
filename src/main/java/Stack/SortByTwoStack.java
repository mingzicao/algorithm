package Stack;

import java.util.LinkedList;


//min = Integer.MAX_VALUE;
// S1 || X X X X                    || S2 initial state
// S1 ||               ->   X X X X || S2 Min1 Max1
// S1 || min1          <-    XXXX   || S2 min2 max2
// s1 || min XX        ->   XX
// S1 || min1 min2     ->  max2 max1|| S2
// S1 || min1 min2 max2 max1   <-   || S2

public class SortByTwoStack {
    public void sort(LinkedList<Integer> s1) {
        if (s1.isEmpty() || s1.size() <= 1) {
            return;
        }
        LinkedList<Integer> s2 = new LinkedList<>();
        while (!s1.isEmpty()) {
            int cur = s1.pollFirst();
            if (s2.isEmpty() || cur >= s2.peek()) {
                s2.offerFirst(cur);
            } else {
                while (!s2.isEmpty() && s2.peek() > cur) {
                    int pop = s2.pollFirst();
                    s1.offerFirst(pop);
                }
                s2.offerFirst(cur);
            }

        }
        while (!s2.isEmpty()) {
            s1.offerFirst(s2.pollLast());
        }
        return;
    }

}
