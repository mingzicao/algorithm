package Array;
import java.util.*;
//sliding window time = O(n)
// space = Map size = O(N)
public class LongestSubStriWithoutRepeat {
    public int lengthOfLongestSubstring(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        if (s.length() == 1) {
            return 1;
        }
        Map<Character, Integer> map = new HashMap<>();
        char[] array = s.toCharArray();
        map.put(array[0], 0);
        int l = 0;
        int r = 1;
        int max = 1;
        int curLen = 1;
        while (r < array.length) {
            if (map.containsKey(array[r])) {
                int i = l;
                l = map.get(array[r])+1;
                while (i < l) {
                    map.remove(array[i++]);
                }
                curLen = r - l + 1;
            } else {
                curLen++;
            }
            max = Math.max(max, curLen);
            map.put(array[r], r++);
        }
        return max;
    }
}