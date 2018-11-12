package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseOnlyVowelsTest {

    ReverseOnlyVowels reverseOnlyVowels = new ReverseOnlyVowels();
    @Test
    void reverse() {
        String Input = "apple";
        reverseOnlyVowels.reverse(Input);

    }
}