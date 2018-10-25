package BinarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SmlestInShiftArrayTest {
    SmlestInShiftArray s = new SmlestInShiftArray();

    @Test
    public void test() {
        int[] input = new int[] {1,2,3};
        int i = s.shiftPosition(input);
        assertEquals(0, 1);
    }

}