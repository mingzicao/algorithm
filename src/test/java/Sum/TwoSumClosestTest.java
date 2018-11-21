package Sum;

import java.util.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumClosestTest {
    TwoSumClosest ts = new TwoSumClosest();

    @Test
    void closest() {
        int[] input = new int[] {2,-3,9};
        List<Integer> list = ts.closest(input, 10);
    }

    @Test
    void closest1() {
        int[] input = new int[] {-1,0,1};
        List<Integer> list = ts.closest(input, 0);
    }
}