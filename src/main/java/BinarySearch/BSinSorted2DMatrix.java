package BinarySearch;/*

Given a 2D matrix that contains integers only,
        which each row is sorted in an ascending order.
        The first element of next row is larger than
        (or equal to) the last element of previous row.

        Given a target number, r
        eturning the position that the target locates within the matrix.
        If the target number does not exist in the matrix, return {-1, -1}.
*/

public class BSinSorted2DMatrix {
    public int[] BSInMatrix(int[][] matrix, int target) {
        int[] result = new int [] {-1, -1};
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return result;
        }
        result[0] = findRow(matrix, target);
        if ( result[0] == -1) {
            return result;
        }
        result[1] = binarySearch(matrix[result[0]], target);
        if (result[1] == -1) {
            result[0] = -1;
        }
        return result;
    }
    private int binarySearch(int[] array, int target) {
        int l= 0;
        int r = array.length -1;
        while (l <= r) {
            int mid = (r - l)/2 + l;
            if (array[mid] == target) {
                return mid;
            } else if (array[mid] < target) {
                l = mid +1;
            } else {
                r = mid -1;
            }

        }
        return -1;
    }
    private int findRow (int[][] matrix, int target) {
        int l = 0;
        int r = matrix.length-1;
        while (l < r - 1) {
            int mid = l + (r - l)/2;
            if (matrix[mid][0] <= target) {
                l = mid;
            } else {
                r = mid -1;
            }
        }
        if ( matrix[r][0] <= target ) {
            return r;
        }
        if (matrix[l][0] <= target) {
            return l;
        }
        return -1;
    }
}
