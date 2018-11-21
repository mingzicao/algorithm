package DynamicProgramming;

public class FindNumerOfBSTGenerate {
    public int numOfTrees(int n) {
        return numofBSTRecursion(n);
    }
    private int  numofBSTRecursion(int n) {
        if (n <= 1) {
            return 1;
        }

        int sum = 0;
        int i = 0;  // i: 0 -> n-1
        while (i < n) {
            int left = numofBSTRecursion(i);  // i = 0 leftsub
            int right = numofBSTRecursion(n -i-1);
            sum = sum + left * right;
            i++;
        }
        return sum;
    }

    public int numofBSTDP(int n) {
        if (n <= 1) {
            return 1;
        }
        int[] M = new int[n+1];
        M[0] = 1;  //
        M[1] = 1; //M[2] = M[0] * M[1] + M[i] * M[0]
        for (int i = 2; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                M[i] += M[j] * M[i-j-1];
            }
        }
        return M[n];
    }
}
