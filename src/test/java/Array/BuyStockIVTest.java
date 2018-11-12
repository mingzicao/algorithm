package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuyStockIVTest {

    BuyStockIV bs4 = new BuyStockIV();
    @Test
    void maxProfit() {
        int[] input = new int[] {2, 3, 2, 1, 4, 5, 2, 11};
        int K = 3;
        int p = bs4.maxProfit(input, K);
        assertEquals(14,p);
    }

    @Test
    void maxProfit1() {
        int[] input = new int[] {1,3};
        int K = 2;
        int p = bs4.maxProfit(input, K);
        assertEquals(2,p);
    }
}