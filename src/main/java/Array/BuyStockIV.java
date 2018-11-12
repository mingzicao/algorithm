package Array;

// given array of stock price,
// calculate the max profit of at Most K transactions.


public class BuyStockIV {
    public int maxProfit(int[] array, int k) {
        return maxProfitRecursion(array, 0, array.length-1, k );
    }
    private int maxProfitRecursion(int[] array, int s, int e, int k) {  // 0 , 1   2,
        if (k == 1) {
            if (s >= e) {
                return 0;
            }
            int min = array[s];
            int profit = 0;
            for (int i = s+1 ; i <= e; i++) {
                profit = Math.max(array[i]- min, profit);
                min = Math.min(min, array[i-1]);
            }
            return profit;
        }
        int maxPro = 0;
        for(int i = s; i <= e; i++) {
            int pro1 = maxProfitRecursion(array, s, i, 1);
            int profitRest = maxProfitRecursion(array, i+1, e, k-1);
            maxPro = Math.max(maxPro,pro1 + profitRest);
        }
        return maxPro;
    }
//    private int maxProfitDP(int[] array, int k) {  // 0 , 1   2,
//        // any sub array of array[] cal it max Range if there is one transaction
//        // Range[i][j] ;
//        // O(N^2) for each (i, j)
//        // Range[i][j]-> Range[i][j+1] if array[j] > Range[min], then update profit , else = Range[i][j];
//
//    }
}

// Recursion Time Complexity; n(n-1)(n-2)(n-k+1)*n =  n!
// K