package DynamicProgramming;

public class EditDistance {
    public int editDistance(String one, String two) {
        if (one.length() == 0 || two.length() == 0) {
            return Math.max(one.length(), two.length());
        }
        int m = one.length()+1;
        int n = two.length()+1;
        int[][] M = new int[m][n];
        char[] arr1 = one.toCharArray();
        char[] arr2 = two.toCharArray();
        for (int i = 0; i < m; i++) {
            M[i][0] = i;
        }
        for (int j = 0; j < n; j++) {
            M[0][j] = j;
        }
        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                int replace = (arr1[i-1] != arr2[j-1]) ? 1 : 0;
                M[i][j] = M[i-1][j-1] + replace;
                int k = Math.min(M[i][j-1], M[i-1][j]) + 1;
                M[i][j] = Math.min(M[i][j], k);
            }
        }
        return M[m-1][n-1];
    }
}
