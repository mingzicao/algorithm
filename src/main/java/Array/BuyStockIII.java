package Array;

// given array of stock price,
// calculate the max profit of at Most Two transactions.

public class BuyStockIII {
    public int maxProfit(int[] array) {
        int[] LMax = new int[array.length];
        LMax[0] = 0;
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            LMax[i] = Math.max(LMax[i-1], array[i] - min);
            min = Math.min(min, array[i]);
        }

        int[] RMax = new int[array.length];
        RMax[array.length-1] = 0;
        int max = array[array.length-1];
        for (int i = array.length-2; i >= 0; i--) {
            RMax[i] = Math.max(max-array[i], RMax[i+1]);
            max = Math.max(max, array[i]);
        }
        int sum = RMax[0];
        for (int i = 0; i < array.length-1; i++) {
            int cur = LMax[i] + RMax[i+1];
            sum = Math.max(cur, sum);
        }
        return sum;
    }
    // time O(n) , space O(n)
    // Max[0: len] = Max {Max[0 : i] + Max[i : len] }; (0<= i <= len)
    // how to represent left half of Max ?
    // LMax[i] represents the max profit of one transaction from array[0 - i];
    // i scan from 0 -> end, remember the min of [i-1],
    // LtoRMax[i] =  previous max, or array[i] - min[i-1]

    // right half of Max ?
    // RMax[i] represents from [i to len], the max Profit of one transaction
    // i scan from End -> 0, remember the max of [i+1];
    // RtoLMax[i] =  prev max, or max[i+1] - array[i];

    // then 0 < i < len;  we can get any sum of two transaction = trans[0: i] + trans[i, len] = LtoR[i] + RtoL[i+1]
    // get the max of all the sum, which is the result;
}
