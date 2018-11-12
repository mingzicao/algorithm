package Array;
// given array of price,
// return the max profit of only one trasactionl;
public class BuyStockI {
    public int maxProfit(int[] array) {
        int[] min = new int[array.length];
        min[0] = array[0];
        for (int i = 1 ; i < min.length; i++) {
            min[i] = Math.min(min[i-1], array[i]);
        }
        int max = array[0];
        int profit = 0;
        for(int i =1; i < array.length; i++ ) {
           profit = Math.max(profit, array[i] - min[i-1]);
        }
        return profit;
        // time O(n), space O(n)；
    }

    public int maxProfit2(int[] array) {
        int min = array[0];
        int profit = 0;
        for (int i = 1 ; i < array.length; i++) {
            profit = Math.max(profit, array[i] - min);
            min = Math.min(min, array[i]);
        }
        return profit;
        // time O(n), space O(1)；
    }
}
