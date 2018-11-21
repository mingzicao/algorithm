package BFS1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KSmallesrWith23FactorTest {
    KSmallesrWith23Factor ks = new KSmallesrWith23Factor();
    @Test
    void kth() {
        int x = ks.kth(2);
        assertEquals(2, x);
    }

    @Test
    void kth1() {
        int x = ks.kth(6);
        assertEquals(8, x);
    }
}