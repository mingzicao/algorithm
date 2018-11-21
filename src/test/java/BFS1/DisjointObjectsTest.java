package BFS1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisjointObjectsTest {
    DisjointObjects d = new DisjointObjects();
    @Test
    void whiteObjects() {
        int[][] input = new int[][]{{1,0,0,0},{1,1,0,0},{0,0,0,1},{1,0,1,1}};
        print(input);
        int o = d.whiteObjects(input);
        assertEquals(1, o);
    }
    private void print(int[][] input ) {
        for (int[] ii : input) {
            for (int i: ii) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}