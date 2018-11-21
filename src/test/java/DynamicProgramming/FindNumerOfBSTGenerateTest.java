package DynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindNumerOfBSTGenerateTest {
    FindNumerOfBSTGenerate fnb = new FindNumerOfBSTGenerate();
    @Test
    void numOfTrees() {
     //   int t = fnb.numOfTrees(3);
        int d = fnb.numofBSTDP(3);
        assertEquals(d, 5);
    }
}