package DynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestAscendingSubArrayTest {
    private LongestAscendingSubArray las = new LongestAscendingSubArray();


    @Test
    void longestSubArrayDP() {
        int[] input = new int[] {1,2,3,4,5};
        int dp = las.longestSubArrayDP(input);
        assertEquals(5, dp);
    }
    @Test
    void longestSubArrayDP1() {
        int[] input = new int[] {8,2,3,4,5};
        int dp = las.longestSubArrayDP(input);
        assertEquals(4, dp);
    }
    @Test
    void longestSubArrayDP2() {
        int[] input = new int[] {3,2,2,1,6};
        int dp = las.longestSubArrayDP(input);
        assertEquals(2, dp);
    }
    @Test
    void longestSubArrayDP3() {
        int[] input = new int[] {1,2,3,4,2,3,4,5,6,7,8};
        int dp = las.longestSubArrayDP(input);
        assertEquals(7, dp);
    }

    @Test
    void longestSubArrayDP4() {
        int[] input = new int[] {1,1,1,1,1};
        int dp = las.longestSubArrayDP(input);
        assertEquals(1, dp);
    }
}