package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountAndSayTest {
    CountAndSay cas = new CountAndSay();



    @Test
    void countAndSay11() {
        String s = cas.countAndSay(1);
        System.out.println(s);
    }

    @Test
    void countAndSay111() {
        String s = cas.countAndSay(2);
        System.out.println(s);
    }

    @Test
    void countAndSay() {
        String s = cas.countAndSay(3);
        System.out.println(s);
    }

    @Test
    void countAndSay1() {
        String s = cas.countAndSay(4);
        System.out.println(s);
    }
}