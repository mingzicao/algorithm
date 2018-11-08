package Array;

import java.util.Arrays;

public class ArrayDedupeIV {
    public int[] dedup(int[] array) {
        if (array ==null || array.length <= 1) {
            return array;
        }
        int i = 0; // include i is the return range;
        int j = 1; // cur scan pointer
        // 1 2 3  | 3 3  j = 2
        // 1 2| j = 2

        boolean topDupe = false;
        while (j < array.length) {
            if (i < 0) {
                /**  最容易Bug 的地方 这里 i 可能是<0 which means the stack is empty,  so if this occurs, put the next element in the stack **/
                array[++i] = array[j++];
            } else if (array[j] != array[i]) {
                if (topDupe) {
                    i--;
                    topDupe = false;
                } else {
                    array[++i] = array[j++];
                }
            } else {  // cur == top
                j++;
                topDupe = true;
            }
        }

        /** 最容易Bug的地方2 ：  assume 输入时  [2,2,2 ...，]最后 j out of bound, 但是 第一个top 没有dedupe pop 出去 * */
        if (topDupe && i >= 0) {
            i--;
        }
        return Arrays.copyOfRange(array, 0, i+1);

        /** 最容易Bug的地方3 ：  i pointer 的意义！！ 包括i 在内的 区域 都是要return的 所以是i+1* */

    }
}
