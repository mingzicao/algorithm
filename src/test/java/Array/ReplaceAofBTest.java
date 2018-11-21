package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReplaceAofBTest {

    ReplaceAofB r = new ReplaceAofB();
    @Test
    void minReplacements() {
        String input =  "aaabbabbaaaabba";
        //          a a a b b a b b a a a a b b a
        // L -> R
        // a a a a a a a a a a a a b b b  -> 5
        int i =  r.minReplacements(input);
        assertEquals(5, i);
    }

    @Test
    void minReplacements1() {
        String input =  "aba";
        int i =  r.minReplacements(input);
        assertEquals(1, i);

    }

    @Test
    void minReplacements2() {
        String input =  "baaaa";
        int i =  r.minReplacements(input);
        assertEquals(1, i);
    }
}