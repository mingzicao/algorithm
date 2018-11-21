package DynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayHopperITest {
    ArrayHopperI ah1 = new ArrayHopperI();
    @Test
    void canJumpDP() {
        int[] input = new int[] {1, 3, 2, 0, 3};
        boolean b1 = ah1.canJumpDP(input);
        boolean b2 = ah1.canJumpRecursion(input);
        assertEquals(b1, b2);
    }

    @Test
    void canJumpDP1() {
        int[] input = new int[] {2, 1, 1, 0, 2};
        boolean b1 = ah1.canJumpDP(input);
        boolean b2 = ah1.canJumpRecursion(input);
        assertEquals(b1, b2);
    }
}