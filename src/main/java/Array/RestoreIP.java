package Array;

import java.util.*;

public class RestoreIP {
    public List<String> Restore(String ip) {
        char[] array = ip.toCharArray();
        List<String> list = new ArrayList<>();
        DFS(array, 0, 0, list, new StringBuilder());
        return list;
    }
    private void DFS (char[] array, int N, int i, List<String> list, StringBuilder sb) {
        if (N < 4 && i >= array.length) {
            return;
        }
        if (N == 4) {
            if (i >= array.length) {
                sb.deleteCharAt(sb.length() -1);
                String s = sb.toString();
                list.add(s);
            }
            return;
        }
        for (int L = 2; L >= 0 ; L--) {
            int part = getInt(array, i, i+L);
            if (part <= 255 && part >= 0) {
                int len = sb.length();
                sb.append(Integer.toString(part));
                sb.append('.');
                DFS(array, N+1, i+L+1, list, sb);
                sb.setLength(len);
            }
        }
    }
    private int getInt(char[] array, int i, int j ) {
        if (j >= array.length) {
            return -1;
        }
        if (array[i] - '0' == 0 && i != j) {   /**Note : The leading Zero before Integer is not valid ***/
            return -1;
        }
        int result = 0;

        while (i <= j) {
            int k = array[i] - '0';

            result = result*10 + k;
            i++;
        }
        return result;
    }
}
