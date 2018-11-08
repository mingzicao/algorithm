package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubStriWithoutRepeatTest {
    LongestSubStriWithoutRepeat lsub = new LongestSubStriWithoutRepeat();

    @Test
    void lengthOfLongestSubstring() {
        String input = "abacdf";
        int l = lsub.lengthOfLongestSubstring(input);
        assertEquals(5, l);
    }

    @Test
    void lengthOfLongestSubstring1() {
        String input = "aaacdf";
        int l = lsub.lengthOfLongestSubstring(input);
        assertEquals(4, l);
    }
    @Test
    void lengthOfLongestSubstring2() {
        String input = "aaaaaa";
        int l = lsub.lengthOfLongestSubstring(input);
        assertEquals(1, l);
    }
    @Test
    void lengthOfLongestSubstring3() {
        String input = "pwwkew";
        int l = lsub.lengthOfLongestSubstring(input);
        assertEquals(3, l);
    }

}