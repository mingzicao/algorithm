package DynamicProgramming;

public class RobPlanning {
    public int maxRob (int[] array) {
        if (array == null || array.length == 0) {
            return 0;
        }
        if (array.length == 1) {
            return array[0];
        }
        if (array.length == 2) {
            return Math.max(array[0], array[1]);
        }
        int [] M = new int[array.length];
        M[0] = array[0];
        M[1] = Math.max(array[0], array[1]);
        for (int i = 2; i < array.length; i++ ){
            M[i] = Math.max(M[i-1], M[i-2]+array[i]);
        }
        return M[array.length-1];
    }
}
