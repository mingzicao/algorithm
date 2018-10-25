package DynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RobPlanningTest {
    RobPlanning rp = new RobPlanning();
    @Test
    void test1 () {
        int[] input = new int [] {2,7,9,3,1};
        int max = rp.maxRob(input);
        assertEquals(12, max);

    }
    @Test
    void test2 () {
        int[] input = new int []  {6, 7, 1, 3, 8, 2, 4};
        int max = rp.maxRob(input);
        assertEquals(19, max);

    }
}