package Array;

import Array.BuyStockII;
import org.junit.jupiter.api.Test;

class BuyStockIITest {
    BuyStockII bs2 = new BuyStockII();

    @Test
    void maxProfit() {
        int[] input = new int[] {5,1,2,3,7,2,5,1,3};
        int p  = bs2.maxProfit(input);

    }
}