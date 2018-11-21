package Sum;

import java.util.*;

public class TwoSumClosest {
    public List<Integer> closest(int[] array, int target) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(array);
        int i = 0;
        int j = array.length-1;
        while (i  <  j - 1) {
            int curDiff = array[i] + array[j] - target;
            int preI = i;
            int preJ = j;
            if  (curDiff == 0) {
                list.add(array[i]);
                list.add(array[j]);
                break;
            } else if (curDiff > 0) {
                j--;
            } else {
                i++;
            }
            int nextDiff = array[i] + array[j] - target;
            if ( Math.abs(curDiff)  < Math.abs(nextDiff)  ) {
                list.add(array[preI]);
                list.add(array[preJ]);
                break;
            }
        }
        if (list.size() == 0) {
            list.add(array[i]);
            list.add(array[j]);
        }

        return list;
}
}
