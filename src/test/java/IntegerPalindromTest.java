import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IntegerPalindromTest {
    IntegerPalindrom ip = new IntegerPalindrom();

    @Test
    void isPalindrome() {
       int  input=  123321;
       ip.isPalindrome(input);
    }
}