package BinarySearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BSinSorted2DMatrixTest {

    private BSinSorted2DMatrix bs = new BSinSorted2DMatrix();
    int[][] input;
    int[] Not_FOUND = new int[] {-1, -1};
    @Test
    public void BSInMatrix() {
        input = new int[][] {{1,2},{5,10}};
        int[] result = bs.BSInMatrix(input,2);
        assertArrayEquals(new int[]{0,1}, result);
    }
    @Test
    public void BSInMatrix24() {
        input = new int[][] {{1,2,3,4},{5,10,11,12}};
        int[] result = bs.BSInMatrix(input,5);
        assertArrayEquals(new int[]{1,0}, result);
    }
    @Test
    public void BSInMatrix33() {
        input = new int[][] {{1,2,3},{5,10,11}, {13, 16, 18}};
        int[] result = bs.BSInMatrix(input,18);
        assertArrayEquals(new int[]{2,2}, result);
    }
    @Test
    public void BSInMatrix331() {
        input = new int[][] {{1,2,3},{5,10,11}, {13, 16, 18}};
        int[] result = bs.BSInMatrix(input,10);
        assertArrayEquals(new int[]{1,1}, result);
    }
    @Test
    public void BSInMatrix333() {
        input = new int[][] {{1,2,3},{5,10,11}, {13, 16, 18}};
        int[] result = bs.BSInMatrix(input,17);
        assertArrayEquals(Not_FOUND, result);
    }
    @Test
    public void BSInMatrix334() {
        input = new int[][] {{1,2,3},{5,10,11}, {13, 16, 18}};
        int[] result = bs.BSInMatrix(input,99);
        assertArrayEquals(Not_FOUND, result);
    }
    @Test
    public void BSInMatrix332() {
        input = new int[][] {{1,2,3},{5,10,11}, {13, 16, 18}};
        int[] result = bs.BSInMatrix(input,1);
        assertArrayEquals(new int[]{0,0}, result);
    }
    @Test
    public void BSInMatrix3() {
        input = new int[][] {{1,2},{5,10}};
        int[] result = bs.BSInMatrix(input,90);
        assertArrayEquals(Not_FOUND, result);
    }
    @Test
    public void BSInMatrix5() {
        input = new int[][] {{1,2},{5,10}};
        int[] result = bs.BSInMatrix(input,-1);
        assertArrayEquals(Not_FOUND, result);
    }
    @Test
    public void BSInMatrix6() {
        input = new int[][] {{1,2},{5,10}};
        int[] result = bs.BSInMatrix(input,8);
        assertArrayEquals(Not_FOUND, result);
    }
    @Test
    public void BSInMatrix7() {
        input = new int[][] {{},{}};
        int[] result = bs.BSInMatrix(input,8);
        assertArrayEquals(Not_FOUND, result);
    }
    @Test
    public void BSInMatrixNull() {
        input =  null;
        int[] result = bs.BSInMatrix(input,8);
        assertArrayEquals(Not_FOUND, result);
    }
    @Test
    public void BSInMatrix8() {
        input = new int[][] {};
        int[] result = bs.BSInMatrix(input,8);
        assertArrayEquals(Not_FOUND, result);
    }
}