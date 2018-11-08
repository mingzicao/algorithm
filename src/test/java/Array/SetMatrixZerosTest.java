package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetMatrixZerosTest {
    SetMatrixZeros smz = new SetMatrixZeros();

    @Test
    void setZero() {
       int[][] input =  new int[][]{{1,1,1},{1,0,1},{1,0,0}};
        print(input);
       smz.setZero(input);
       print(input);

    }

    private void print(int[][] Matrix) {
        for (int[] i : Matrix) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}