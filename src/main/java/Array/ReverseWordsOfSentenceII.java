package Array;

public class ReverseWordsOfSentenceII {
    public String reverseWords(String input) {
        if (input == null || input.length() == 0) {
            return input;
        }
        char[] array = input.toCharArray();
        int i = 0;
        int cur = -1; // include cur is the valid right bound
        while (i < array.length && array[i] == ' ') {
            i++; // remove leading space;
        }

        boolean oneSpace = true;
        while (i < array.length) {
            if (array[i] != ' ') {
                array[++cur] = array[i++];
                oneSpace = true;
            } else if (oneSpace && array[i] == ' ') {
                array[++cur] = array[i++];
                oneSpace = false;
            } else {
                i++; // dupe space
            }
        }
        reverse(array, 0, cur);  // reverse whole sentence;
        i = 0;
        while (array[i] == ' ') {
            i++; // trailing space now becoms heading space
        }
        // valid range : array[i, cur]
        int l = i;
        int r = l;  // reverse each word
        while (r <= cur) {
            if (array[r] != ' ') {
                r++;
            } else {
                reverse(array, l, r-1);
                l = r+1;
                r++;
            }
        }
        reverse(array, l, cur); // last word
        StringBuilder sb = new StringBuilder();
        while (i <= cur) {
            sb.append(array[i++]);
        }
        return sb.toString();
    }
    private void reverse(char[] array, int l, int r) {
        while (l < r) {
            char tmp = array[r];
            array[r] = array[l];
            array[l] = tmp;
            l++; r--;
        }
        return;
    }
}
