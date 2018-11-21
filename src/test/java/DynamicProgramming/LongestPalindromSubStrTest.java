package DynamicProgramming;

import Array.LargestContainer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestPalindromSubStrTest {
    LongestPalindromSubStr  lsp = new LongestPalindromSubStr();
    @Test
    void longestPalindrome() {
        String input = "abcdefedcba";
        String output = lsp.longestPalindrome(input);
        assertEquals(input, output);
    }
}