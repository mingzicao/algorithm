package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortInSpecificOrderTest {
    private SortInSpecificOrder sio = new SortInSpecificOrder();

    @Test
    void sortSpecial() {
        int[] A1 = new int[] {1,5, 9,2,3,4,4};
        int[] A2 = new int[] {3, 4};
        sio.sortSpecial(A1,A2);
        for (int i :  A1) {
            System.out.print(i);
        }

    }
}