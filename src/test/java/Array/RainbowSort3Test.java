package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RainbowSort3Test {
    RainbowSort3 rb3 = new RainbowSort3();
    @Test
    void rainbowSortIII() {
       int[] input = new  int[] {1,2,3,1,2,3,1,3,};
       int[] result = rb3.rainbowSortIII(input, 3);
       print(result);
    }

    @Test
    void rainbowSortIII2() {
        int[] input = new  int[] {1,2,3,1,2,3,1,4,4,6,3,};
        int[] result = rb3.rainbowSortIII(input, 6);
        print(result);
    }

    private void print(int[] in) {
        for (int i : in) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}