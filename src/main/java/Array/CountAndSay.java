package Array;

public class CountAndSay {
    public String countAndSay(int n) {
        int k = 1;
        String pre = "1";
        while (k < n) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            int count = 1;
            while (i < pre.length() - 1) {
                if (pre.charAt(i) == pre.charAt(i + 1)) {
                    count++;
                } else {
                    sb.append(count);
                    sb.append(pre.charAt(i));
                    count = 1;
                }
                i++;
            }
            sb.append(count);
            sb.append(pre.charAt(pre.length()-1));
            pre = sb.toString();
            k++;
        }
        return pre;
    }
}
