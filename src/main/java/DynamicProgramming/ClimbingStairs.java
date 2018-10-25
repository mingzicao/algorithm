package DynamicProgramming;



public class ClimbingStairs {
    public int nways (int n) {
        int[] N = new int[n+1];
        N[1] = 1;
        N[2] = 2;
        //N[i] represents the way we can reach i;
        //N[i] = N[i-1]+1; OR N[i-2] + 2
        // 1 2 3   {1,1,1} {1,2} {2,1}
        for (int i = 3; i < N.length; i++) {
            N[i] = N[i-1] + N[i-2];
        }
        return N[n];
    }

}
