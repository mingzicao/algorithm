package DivideAndConquer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InversionCountTest {
    InversionCount ic = new InversionCount();

    @Test
    void inversion() {
        int[] input = new int[] {4,1,3,2};
        int i = ic.inversion(input);
        assertEquals(4, i);
    }


    @Test
    void inversion2() {
        int[] input = new int[] { 1, 20, 6, 4, 5 }; // (20, 6) (20, 4) (20, 5) (6, 4) (6, 5);
        // 1 20 6 -> 1
        // 1 20 6
        int i = ic.inversion(input);
        assertEquals(5, i);
    }

    @Test
    void inversion3() {
        int[] input = new int[] { 1, 20, 6}; // (20, 6) (20, 4) (20, 5) (6, 4) (6, 5);
        // 1 20 6 -> 1
        // 1 20 6
        int i = ic.inversion(input);
        assertEquals(1, i);
    }


    @Test
    void mergeCount() {
        int[] input = new int[] { 1, 20, 6}; // (20, 6) (20, 4) (20, 5) (6, 4) (6, 5);
        // 1 20 6 -> 1
        // 1 20 6
        int[] arr = new int[input.length];
        int i = ic.mergeAndCount(input,arr, 0 , 2, 2);
        assertEquals(1, i);
    }
    @Test
    void countInversion() {
//        int[] input = new int[] {4,1};
//        int[] input2 = new int[] {3,2};
//        ic.inversion()

    }
}