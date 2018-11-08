package Stack;

import org.junit.jupiter.api.Test;
import sun.awt.image.ImageWatched;

import java.util.LinkedList;

import static org.junit.jupiter.api.Assertions.*;

class SortByTwoStackTest {
    SortByTwoStack st = new SortByTwoStack();


    @Test
    void sort() {
        LinkedList<Integer> s1 = new LinkedList<>();
        Stack.makeStack(s1, new int[] {4,2,1,7,5});
        Stack.printStack(s1);
        st.sort(s1);
        Stack.printStack(s1);

    }
    @Test
    void sort1() {
        LinkedList<Integer> s1 = new LinkedList<>();
        Stack.makeStack(s1, new int[] {2});
        Stack.printStack(s1);
        st.sort(s1);
        Stack.printStack(s1);

    }

    @Test
    void sort2() {
        LinkedList<Integer> s1 = new LinkedList<>();
        Stack.makeStack(s1, new int[] {9,10,4});
        Stack.printStack(s1);
        st.sort(s1);
        Stack.printStack(s1);

    }
}