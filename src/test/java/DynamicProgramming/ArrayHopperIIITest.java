package DynamicProgramming;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayHopperIIITest {
    ArrayHopperIII ap3 = new ArrayHopperIII();
    @Test
    void minJump() {
        int[] input=  new int[]{1,2,0};
        int min = ap3.minJump(input);
        System.out.println(min);

    }
}