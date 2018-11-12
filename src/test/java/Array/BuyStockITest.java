package Array;

import Array.BuyStockI;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BuyStockITest {
    BuyStockI bs1 = new BuyStockI();
    @Test
    void maxProfit() {
        int[] input = new int[]{6,4,8,2,7,1,3};
        int p = bs1.maxProfit(input);
        int p1 = bs1.maxProfit2(input);
        assertEquals(p,p1);
    }
}