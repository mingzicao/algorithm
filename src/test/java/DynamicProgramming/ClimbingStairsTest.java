package DynamicProgramming;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ClimbingStairsTest {
    ClimbingStairs cs = new ClimbingStairs();
    @Test
    void test1() {
        int stair = 4;
        int nways = cs.nways(stair);
        assertEquals(5, nways);
    }

}