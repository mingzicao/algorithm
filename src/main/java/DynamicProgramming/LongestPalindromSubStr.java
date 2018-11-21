package DynamicProgramming;

public class LongestPalindromSubStr {
    public String longestPalindrome(String input) {
        if (input.length() <= 1) {
            return input;
        }
        char[] array = input.toCharArray();
        int len = array.length;
        boolean [][] M = new boolean[len][len];
        int max = 1;
        int s = 0;
        for (int L = len; L > 0; L--){ // len   ->  1
            int x = 0;
            int y = x + len - L;
            for (int i = 0; i < L; i++) {
                int a = x + i;
                int b = y + i;
                if (b - a == 0)  {
                    //only one char base case;
                    M[a][b] = true;
                } else if (b - a == 1) {
                    // two chars,
                    M[a][b] = (array[a] == array[b]) ? true : false;
                } else {
                    if (M[a+1][b-1] && array[a] == array[b]) {
                        M[a][b] = true;
                    } else {
                        M[a][b] = false;
                    }
                }
                if (M[a][b] && (b - a + 1) > max) {
                    max = b-a+1;
                    s = a;  // recorde the begin of the longest substring palindrom
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (int i = s; i < s + max; i++) {
            sb.append(array[i]);
        }
        return sb.toString();
    }
}
