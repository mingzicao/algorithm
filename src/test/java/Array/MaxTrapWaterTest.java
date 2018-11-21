package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxTrapWaterTest {
    MaxTrapWater mt = new MaxTrapWater();

    @Test
    void maxTrapped1() {
        int[] input = new int[] {2,1,3,1,2,3,1};
        int t = mt.maxTrapped1(input);
        int t2 = mt.maxTrapped2(input);
        assertEquals(t2, t);
    }

    @Test
    void maxTrapped2() {
        int[] input = new int[] {3, 0, 0, 2, 0,4};
        int t = mt.maxTrapped1(input);
        int t2 = mt.maxTrapped2(input);
        assertEquals(t2, t);
    }

    @Test
    void maxTrapped3() {
        int[] input = new int[] {4,1,2,3,5,3,6};
        int t = mt.maxTrapped1(input);
        int t2 = mt.maxTrapped2(input);
        assertEquals(t2, t);
    }
}