package PriorityQueue;

import java.util.*;

public class K357Factor {
    public long kth(int k) {
        // initial state (3 5 7) // 1 1 1 BFS2 -> pollMin, and expande next 3 tuples add to pq if not visited;
        // terminate condition if k = 1, top of the min Heap is the result;
        Long s = 3*5*7L;
        Set<Long> visited = new HashSet<>();
        visited.add(s);
        PriorityQueue<Long> minHeap = new PriorityQueue<>();
        minHeap.offer(s);
        while (k > 1) {
            Long cur = minHeap.poll();
            k--;
            if (!visited.contains(cur*3)) {
                minHeap.offer(cur*3);
                visited.add(cur*3);
            }
            if (!visited.contains(cur*5)) {
                minHeap.offer(cur*5);
                visited.add(cur*5);
            }
            if (!visited.contains(cur*7)) {
                minHeap.offer(cur*7);
                visited.add(cur*7);
            }
        }
        return minHeap.peek();

    }
}
