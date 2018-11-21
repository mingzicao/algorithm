package Array;

public class findKin2DMatrix {
    public int findElement(int[][] matrix, int k) {
        int m = matrix.length;
        int n = matrix[0].length;
        int row = k-1/m;
        int col = k%n -1;
        return matrix[row][col];
    }
}
