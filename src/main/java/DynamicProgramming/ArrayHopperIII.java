package DynamicProgramming;

public class ArrayHopperIII {
    public int minJump(int[] array) {
        int[] M = new int[array.length+1];
        for (int i = 1; i < array.length+1; i++) {
            M[i] = -1;
        }
        M[0] = (array[0] > 0) ? 1 : -1;

        for (int i = 1; i < array.length+1; i++) {
            for (int j = 0; j < i; j++) {
                if (M[j] > 0 && array[j] + j >= i) {
                    M[i-1] = (M[i-1] == -1) ? M[j] +1 : Math.min(M[j]+1, M[i-1]);
                }
            }
        }
        return M[array.length];
    }
}
