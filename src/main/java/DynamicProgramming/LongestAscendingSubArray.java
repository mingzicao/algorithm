package DynamicProgramming;
/*
* Given an array A[0]...A[n-1] of integers,
* find out the length of the longest ascending subsequence.
* Assumptions: A is not null
* */
public class LongestAscendingSubArray {
    public int longestSubArrayDP(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        int[] M = new int [array.length];
        M[0] = 1;
        int curMax = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] > array[i-1]) {
                M[i] = M[i-1]+1;
                curMax = Math.max(curMax, M[i]);
            } else {
                M[i] = 1;
            }
        }
        return curMax;
    }

}




