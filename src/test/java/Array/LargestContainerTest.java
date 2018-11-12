package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LargestContainerTest {
    LargestContainer lc = new LargestContainer();
    @Test
    void largest2() {
        int[] input = new int [] {1,2,1,3,4,5,3};
        int v1 = lc.largest(input);
        int v2 = lc.largest2(input);
        assertEquals(v1, v2);

    }
}