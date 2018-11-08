package Array;
import java.util.*;
public class SetMatrixZeros {
    // time = O(n^2);
    // space : O(n);
    public void setZero(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return;
        }
        int M = matrix.length;
        int N = matrix[0].length;
        Set<Integer> row = new HashSet<>();
        Set<Integer> colomn = new HashSet<>();
        for (int i = 0; i < M; i++ ) {
            for (int j = 0; j < N; j++) {
                if (matrix[i][j] == 0) {
                    row.add(i);
                    colomn.add(j);
                }
            }
        }
        for (int r : row) {
            for (int j = 0; j < N; j++ ) {
                matrix[r][j] = 0;
            }
        }
        for (int c : colomn) {
            for (int j = 0; j < M; j++ ) {
                matrix[j][c] = 0;
            }
        }

    }
}
