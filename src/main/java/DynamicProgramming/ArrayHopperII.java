package DynamicProgramming;
// min step jumo from 0 to end

public class ArrayHopperII {
    public int minJump(int[] array) {
        int[] Min = new int[array.length];
        for (int i = 1; i < Min.length; i++) {
            Min[i] = -1;
        }
        // Min means the min step from 0 to array[i], if = -1 means cannot jump;
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (Min[j] >= 0 && array[j] + j >= i) {
                    Min[i] = Min[i] == -1 ? Min[j]+1 : Math.min(Min[i], Min[j]+1);
                }
            }
        }
        return Min[array.length-1];
    }
}
