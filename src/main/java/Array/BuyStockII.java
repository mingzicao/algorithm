package Array;
// given array of price,
// calculate the overall profit, no limit on transactions

public class BuyStockII {
    public int maxProfit(int[] array) {
        int j = 0;
        int i = 0;
        int profit = 0;
        while (j+1  <  array.length) {
            if (array[j+1] >= array[j]) {
                j++;
            } else {
                profit = array[j] - array[i] + profit;
                i = ++j;
            }
        }
        if (i != j) {
            profit +=  array[j] - array[i];
        }
        return profit;
    }
}
