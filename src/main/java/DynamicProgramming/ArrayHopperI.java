package DynamicProgramming;
// check if u can jump
// from begin to end of the array;

public class ArrayHopperI {
    // DP  O(n^2)  space o(n)；
    public boolean canJumpDP(int[] array) {
        boolean[] M = new boolean[array.length];
        // M[i] represent if u can jump from 0 to M[i];
        M[0] = true;
        for (int i = 1 ; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (M[j] && (j + array[j] >= i)) {
                    M[i] = true;
                    break;
                }
            }
        }
        return M[array.length-1];
    }
    // Recursion：n!
    public boolean canJumpRecursion (int[] array) {
        return canJump(array, 0 , array.length -1);
    }

    private boolean canJump(int[] array, int s, int e) {
        if (s == e) {
            return true;
        }
        // [s  : e]
        for (int i = s; i < e; i++) {
            if (canJump(array, s, i) && (array[i] + i >= e)) {
                return true;
            }
        }
        return false;
    }

}
