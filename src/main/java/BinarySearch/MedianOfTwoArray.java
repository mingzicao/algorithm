package BinarySearch;

import java.util.*;

public class MedianOfTwoArray {
    public double median(int[] a, int[] b) {
        PriorityQueue<Integer> smaller = new PriorityQueue<>(Collections.reverseOrder()); // put smaller half here
        PriorityQueue<Integer> larger = new PriorityQueue<>();
        putArrayInHeap(a, smaller, larger);
        putArrayInHeap(b, smaller, larger);
        if (smaller.size() > larger.size()) {
            return smaller.peek();
        }
        int x = smaller.peek();
        int y = larger.peek();
        return (double)(x+y)/2;

    }
    private void putArrayInHeap(int[] a ,  PriorityQueue<Integer> smaller, PriorityQueue<Integer> larger) {
        int i = 0;
        while(i < a.length) { //5, 4， 1，3 ，2 5 6
            // smaller ||1 2 3
            // larger || 5 5 4
            // maintain smaller.size - larger.size <= 1;
            if (smaller.size() <= larger.size()) {
                if (larger.isEmpty() || a[i] <= larger.peek()) {
                    smaller.offer(a[i]);
                } else {
                    smaller.offer(larger.poll());
                    larger.offer(a[i]);
                }
            } else {
                if (a[i] >= smaller.peek()) {
                    larger.offer(a[i]);
                } else {
                    larger.offer(smaller.poll());
                    smaller.offer(a[i]);
                }
            }
            i++;
        }
    }
}
