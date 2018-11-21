package Array;

public class MaxTrapWater {
    public int maxTrapped1(int[] array) {
        // method 1 two pointer time : O(n^2);
        // space O(1)
        if (array.length <= 2) {
            return 0;
        }
        int i = 0;
        int j = i+1;
        int max = 0;
        while (j < array.length) {
            if (array[j] >= array[i]) {
                int w = 0;
                int L = array[i];
                while (i < j) {
                    w = L - array[i++] + w;
                }
                max = w + max;
            }
            j++;
        }
        return max;

    }
    public int maxTrapped2(int[] array) {
        // method 2  time : O(n);
        // space O(n)
        if (array.length <= 2) {
            return 0;
        }
        int[] L = new int[array.length]; // scan from l to r, the max height @ left side of arr[i] including i;
        int[] R = new int[array.length]; // scan from r to l, the max height @ right side of arr[i], includeing i ;
        L[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > L[i-1]) {
               L[i] = array[i];
            } else {
                L[i] = L[i-1];
            }
        }
        R[array.length-1] = array[array.length-1];
        for (int i = array.length-2; i >= 0; i--) {
            if (array[i] > R[i+1]) {
                R[i] = array[i];
            } else {
                R[i] = R[i+1];
            }
        }
        int W = 0;
        for (int i = 0; i < array.length;i++) {
            L[i] = Math.min(L[i], R[i]);
            W = W + L[i] - array[i];
        }
        return W;
    }
}
