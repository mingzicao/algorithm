package Array;

import java.util.Arrays;

public class ArrayDedupeV {
    public int[] dedup(int[] array) {
        if (array == null || array.length <= 2) {
            return array;
        }
        int i = 0; // top stack
        int j = 1;
        //a a a
        //0 1 2
        boolean less2 = true;
        while (j < array.length) {
            if (array[j] != array[i]) {
                array[++i] = array[j++];
                less2 = true;
            } else {
                if (less2) {
                    array[++i] = array[j++];
                    less2 = false;
                } else {
                    j++;
                }
            }
        }
        return Arrays.copyOfRange(array, 0 , i+1);
    }
}
