package Array;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.junit.jupiter.api.Assertions.*;

class MaxOfKSlidingWindowTest {
    MaxOfKSlidingWindow ms = new MaxOfKSlidingWindow();
    @Test
    void maxWindows() {
        int[] input = new int[] {5,2,1,4,3,6,2,8,3,1,4};
        List<Integer> list = ms.maxWindows(input, 4);
    }

    @Test
    void maxWindows2() {
        int[] input = new int[] {2,1};
        List<Integer> list = ms.maxWindows(input, 1);
    }
}