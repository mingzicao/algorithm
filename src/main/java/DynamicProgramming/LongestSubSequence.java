package DynamicProgramming;

public class LongestSubSequence {


    public int longestSubSeqDP (int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int max = 1;
        int [] M = new int[array.length];
        M[0] = 1;
        // M[i] represents that the longest subseq from (0, i), including array[i];
        for (int i = 1; i < array.length; i++) {
            M[i] = 1;
            for (int j = 0 ; j < i; j++) {
                if (array[j] < array[i]) {
                    M[i] = Math.max(M[i], 1 + M[j]);
                }
            }
            max = Math.max(max,M[i]);
        }
        return max;
    }
}
