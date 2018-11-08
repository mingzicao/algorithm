package Array;
import java.util.*;

public class SortInSpecificOrder {
    class MyComparator implements Comparator<Integer> {
        Map<Integer, Integer> indexMap;
        public MyComparator(Map<Integer, Integer> map) {
            indexMap = map;
        }
        @Override  // ascending
        public int compare(Integer i1, Integer i2) {
            Integer d1 = indexMap.get(i1);
            Integer d2 = indexMap.get(i2);
            if (d1 == null && d2 == null) {
                return i1.compareTo(i2);
            }
            if (d2 == null) { return -1; }
            if (d1 == null) {return 1;}
            return d1 < d2 ? -1 : 1;
        }
    }
    public int[] sortSpecial(int[] A1, int[] A2) {
        Map<Integer, Integer> indexMap = new HashMap<>();
        for (int i = 0; i < A2.length; i++) {
            indexMap.put(A2[i], i);
        }
        PriorityQueue<Integer> pq = new PriorityQueue<>(new MyComparator(indexMap));
        for (int i : A1) {
            pq.offer(i);
        }
        for (int i = 0 ; i < A1.length; i++) {
            A1[i] = pq.poll();
        }
        return A1;

    }

}
