package String;

public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) {
            return "";
        }
        if (strs.length == 1) {
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();
        boolean append = true;
        int k = 0;
        while (append) {
            char c = 'a';
            boolean isSame = false;
            for (int i = 0; i < strs.length && append; i++) {
                if (i == 0 && k < strs[0].length()) {
                    c = strs[0].charAt(k);
                    isSame = true;
                }
                else if (k > strs[i].length() -1 || strs[i].charAt(k) != c) {
                    isSame = false;
                    append = false;
                }
            }
            if (isSame) {
                sb.append(c);
            }
            k++;
        }
        return sb.toString();
    }
}
