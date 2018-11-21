package PriorityQueue;
import java.util.*;
public class ZigZagConversion {
    class Cell implements Comparable<Cell> {
        int r;
        int c;
        char ch;
        Cell(int r, int c, char ch) {
            this.r = r;
            this.c = c;
            this.ch = ch;
        }
        @Override
        public int compareTo(Cell c) {
            if (this.r == c.r) {
                return this.c < c.c ? -1 : 1;
            }
            return this.r < c.r ? -1 : 1;
        }
    }
    public String convert(String input, int nRows) {
        if (input == null || input.length() <= 1||nRows == 1) {
            return input;
        }
        char[] array = input.toCharArray();
        PriorityQueue<Cell> pq  = new PriorityQueue<>();
        convert(array, 0, 0, nRows, pq);
        StringBuilder sb = new StringBuilder();
        while (!pq.isEmpty()) {
            sb.append(pq.poll().ch);
        }
        return sb.toString();
    }
    private void convert(char[] array, int begin, int col, int N, PriorityQueue<Cell> pq) {
        if (begin >= array.length) {
            return;
        }
        for (int i = 0; i < N; i++) {
            if (begin > array.length-1) {break;}
            Cell cell = new Cell(i, col, array[begin++]);
            pq.offer(cell);
        }
        for (int i = 0; i < N-2; i++) {
            if (begin > array.length -1) {break;}
            Cell cell = new Cell(N-2-i, col+i+1, array[begin++]);
            pq.offer(cell);
        }
        convert(array, begin, col+N-1, N, pq);
    }
}
