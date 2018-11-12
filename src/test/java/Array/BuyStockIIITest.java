package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuyStockIIITest {
    BuyStockIII bs = new BuyStockIII();
    @Test
    void maxProfit() {
        int[] input = new int[] {3,4,1,2,6,2,3,5,1,7,3,8};
        int p = bs.maxProfit(input);
        assertEquals(12, p);
    }

    @Test
    void maxProfit1() {
        int[] input = new int[] {1,2,3,4};
        int p = bs.maxProfit(input);
        assertEquals(3, p);
    }

    @Test
    void maxProfit2() {
        int[] input = new int[] {1,2};
        int p = bs.maxProfit(input);
        assertEquals(1, p);
    }

    @Test
    void maxProfit3() {
        int[] input = new int[] {2,1};
        int p = bs.maxProfit(input);
        assertEquals(0, p);
    }
}
