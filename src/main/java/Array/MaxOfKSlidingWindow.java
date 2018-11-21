package Array;
import java.util.*;
public class MaxOfKSlidingWindow {
    public List<Integer> maxWindows(int[] array, int k) {
        // array[1 2 7 4 5 1 8 0]  k = 3
        //          |7|
        List<Integer> result = new ArrayList<>();
        if (k > array.length) {
            return result;
        }
        int max = array[0];
        // maintain the L is the max of window, and R - L <= K;
        int L = 0;
        for (int i = 0; i < k; i++) {
            if (array[i] > max) {
                max = Math.max(max, array[i]);
                L = i;
            }
        }
        result.add(max);
        int R = k ;
        while (R < array.length) {
            int in = array[R];
            if (in >= max) { // new R is the max,
                max = in;
                L = R++;
            } else {
                if (R - L == k) {
                    // case one: old max will pop AND new R is not new Max;
                    max = in;
                    for (int i = L+1; i<= R; i++) {
                        if (array[i] >= max) {
                            max = array[i];
                            L = i;
                        }
                    }
                    R++;
                } else {
                    //windowL still maintain the max;
                    R++;
                }
            }
            result.add(array[L]);
        }
        return result;
    }
}
