package BFS1;
import  java.util.*;
public class DisjointObjects {
    public int whiteObjects(int[][] matrix) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        boolean [][] visited = new boolean[matrix.length][matrix[0].length];
        return findObjects(matrix, visited);
    }
    private int findObjects(int[][] matrix, boolean[][] visited) {
        int obj = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0 && !visited[i][j]) {
                    BFS(matrix, i , j, visited);
                    obj++;
                }
            }
        }
        return obj;
    }
    private void BFS(int[][] matrix, int i, int j, boolean[][] visited) {
        LinkedList<Cell> queue = new LinkedList<>();
        queue.offerLast(new Cell(i, j));
        visited[i][j] = true;
        while (!queue.isEmpty()) {
            Cell c = queue.pollFirst();
            int row = c.r;
            int col = c.c;
            if (row+1 < matrix.length && (matrix[row+1][col] == 0) && (!visited[row+1][col])) {
                queue.offerLast(new Cell(row+1, col));
                visited[row+1][col] = true;
            }
            if (col+1 < matrix[0].length && (matrix[row][col+1] == 0) && (!visited[row][col+1])) {
                queue.offerLast(new Cell(row, col+1));
                visited[row][col+1] = true;
            }
            if (row-1 >= 0 && (matrix[row-1][col] == 0) && (!visited[row-1][col])) {
                queue.offerLast(new Cell(row-1, col));
                visited[row-1][col] = true;
            }
            if (col-1 >= 0  && (matrix[row][col-1] == 0) && (!visited[row][col-1])) {
                queue.offerLast(new Cell(row, col-1));
                visited[row][col-1] = true;
            }
        }
    }


    class Cell {
        int r;
        int c;

        Cell(int r, int c) {
            this.r = r;
            this.c = c;
        }
    }
}
