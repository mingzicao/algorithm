package BFS1;
import java.util.*;
public class KSmallesrWith23Factor {
    class MyComparator implements Comparator<List<Integer>> {
        @Override
        public int compare(List<Integer> l1, List<Integer> l2) {
            double s1 = Math.pow(2, l1.get(0))  * Math.pow(3, l1.get(1));
            double s2 = Math.pow(2, l2.get(0))  * Math.pow(3, l2.get(1));

            if (s1 == s2) {return 0;}
            return s1 < s2 ? -1 : 1;
        }
    }
    public int kth(int k) {
        PriorityQueue<List<Integer>> pq = new PriorityQueue<>(new MyComparator());
        Set<List<Integer>> visited = new HashSet<>();
        List<Integer> cur = new ArrayList<>();
        cur.add(0);
        cur.add(0);
        pq.offer(cur);
        visited.add(cur);
        while (k > 1) {
            List<Integer> l = pq.peek();

            cur  = pq.poll();
            k--;

            int i = cur.get(0);
            int j = cur.get(1);
            List<Integer> next = new ArrayList<>();
            next.add(i+1);
            next.add(j);
            if (!visited.contains(next)) {
                pq.offer(next);
                visited.add(next);
            }
            List<Integer> next2 = new ArrayList<>();
            next2.add(i);
            next2.add(j+1);
            if (!visited.contains(next2)) {
                pq.offer(next2);
                visited.add(next2);
            }

        }

        List<Integer> l = pq.peek();

        Double result = Math.pow(2, l.get(0))  * Math.pow(3, l.get(1));
      return result.intValue();
    }
    public static void main(String[] args) {
        List<Integer> l1 = new LinkedList<>();
        l1.add(0);
        Set<List<Integer>> set = new HashSet<>();
        set.add(l1);
        List<Integer> l2 = new LinkedList<>();
        l2.add(0);
        System.out.print(set.contains(l2));
        set.add(l2);
        System.out.print(set.size());
    }
}
