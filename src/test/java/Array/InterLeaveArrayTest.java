package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InterLeaveArrayTest {

    InterLeaveArray ila = new InterLeaveArray();
    @Test
    void interleave() {
        int[] input = new int[] {1,1,2,2,-1,3,-5};
        int[] out = ila.interleave(input);
        for (int i :  out) {
            System.out.print(i+ " ");
        }
    }

    @Test
    void interleave1() {
        int[] input = new int[] {1,-1, -2,-2,-1,3,-5};
        int[] out = ila.interleave(input);
        for (int i :  out) {
            System.out.print(i+ " ");
        }
    }

    @Test
    void interleave2() {
        int[] input = new int[] {-1,1,1,1,1,1,1,-1};
        int[] out = ila.interleave(input);
        for (int i :  out) {
            System.out.print(i+ " ");
        }
    }

}