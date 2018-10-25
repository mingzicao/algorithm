package BinarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SqrTest {

    public Sqr sqr = new Sqr();

    @Test
    public void test() {
        int i =sqr.sqrt(101);
        assertEquals(10, i);
    }

    @Test
    public void test2() {
        int i =sqr.sqrt(1000001);
        assertEquals(1000, i);
    }





}