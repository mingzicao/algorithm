package DynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LongestSubSequenceTest {


    private LongestSubSequence las = new LongestSubSequence();

    @Test
    public void DPtest() {
        int[] input = new int [] {1,2,3,4,5,6,7}; //{}
        int max = las.longestSubSeqDP(input);
        assertEquals(7,max);
    }
    @Test
    public void DPtest1() {
        int[] input = new int [] {3,4,7,1,2,8,5}; //{}
        int max = las.longestSubSeqDP(input);
        assertEquals(4,max);
    } @Test
    public void DPtest2() {
        int[] input = new int [] {1,7,6,8,9,3,10,4,7,8,9}; //{}
        int max = las.longestSubSeqDP(input);
        assertEquals(6,max);
    }



}