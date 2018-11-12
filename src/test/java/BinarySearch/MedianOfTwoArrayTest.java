package BinarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MedianOfTwoArrayTest {
    MedianOfTwoArray m = new MedianOfTwoArray();

    @Test
    void median() {
        int[] a = new int[]{5,1,4};
        int[] b = new int[]{2,7,3};//  1 2 3  4 5 7
        double median  = m.median(a, b);
        assertEquals(3.5, median);
    }

    @Test
    void median1() {
        int[] a = new int[]{5};
        int[] b = new int[]{};//  1 2 3  4 5 7
        double median  = m.median(a, b);
        assertEquals(5, median);
    }
}