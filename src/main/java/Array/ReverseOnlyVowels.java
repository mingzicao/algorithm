package Array;

import java.util.*;

public class ReverseOnlyVowels {
    public String reverse(String input) {
        if (input == null || input.length() <= 1) {
            return input;
        }
        char[] array = input.toCharArray();
        Set<Character> set = new HashSet<>();
        char[] ch = new char[] {'a','e','i', 'o','u'};
        for (char c : ch) {
            set.add(c);
        }
        int i = 0;
        int j = array.length -1;
        while (i < j) {
            if (!set.contains(array[i])) {
                i++;
            } else if (! set.contains(array[j])) {
                j--;
            } else {
                char tmp = array[i];
                array[i++] = array[j];
                array[j--] = tmp;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : array) {
            sb.append(c);
        }
        return sb.toString();
    }
}
