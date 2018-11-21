package String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestCommonPrefixTest {
    LongestCommonPrefix lcp = new LongestCommonPrefix();
    @Test
    void longestCommonPrefix() {
        String[] str = new String[] {"flower", "flo", "fly"};
        String s = lcp.longestCommonPrefix(str);
        System.out.println(s);
    }
}