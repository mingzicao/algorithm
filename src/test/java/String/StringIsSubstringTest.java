package String;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringIsSubstringTest {
    StringIsSubstring ss = new StringIsSubstring();
    @Test
    void strstr() {
        String large = "abcdefg";
        String small = "cde";
        int i = ss.strstr(large, small);
        assertEquals(2, i);
    }
}