package BinarySearch;

import BinarySearch.ClassicBinarySearch;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.anyOf;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ClassicBinarySearchTest {

    public ClassicBinarySearch cbs = new ClassicBinarySearch();;

    private int NOT_FOUND = -1;

    private int[] input;


    @Test
    public void testNull () {
        int result = cbs.binarySearch(input, 0);
        assertEquals( NOT_FOUND, result);
    }

    @Test
    public void testEmptyArray() {
        input = new int[]{};
        int result = cbs.binarySearch(input, 0);
        assertEquals( NOT_FOUND, result);
    }

    @Test
    public void testOneElementArrayNotFound() {
        input = new int[]{1};
        int result = cbs.binarySearch(input, 0);
        assertEquals( NOT_FOUND, result);

    }

    @Test
    public void testOneElementArray() {
        input = new int[]{1};
        int result = cbs.binarySearch(input, 1);
        assertEquals(0, result);

    }

    @Test
    public void testTwoElementArrayLeft() {
        input = new int[] {1,3};
        int result = cbs.binarySearch(input, 1);
        assertEquals(0, result);
    }

    @Test
    public void testTwoElementArrayRight() {
        input = new int[] {1,3};
        int result = cbs.binarySearch(input, 3);
        assertEquals(1, result);
    }

    @Test  //Fail Case
    public void testTwoElementArrayNotFould2() {
        input = new int[] {1,2};
        int result = cbs.binarySearch(input, 0);
        assertEquals(NOT_FOUND, result);
    }
    @Test
    public void testTwoElementArrayNotFound() {
        input = new int[] {1,3};
        int result = cbs.binarySearch(input, 2);
        assertEquals(NOT_FOUND, result);
    }

    @Test
    public void testLongArray() {
       input  = new int [] {1, 2, 2, 2, 3, 4};
       int result = cbs.binarySearch(input, 2);
       assertThat(result, anyOf(equalTo(1), equalTo(2), equalTo(3)));

    }

    @Test
    public void testLongArrayNotfound() {
        input  = new int [] {1, 2, 2, 2, 3, 4};
        int result = cbs.binarySearch(input, 5);
        assertEquals(NOT_FOUND, result);

    }



}
