package Array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class findKin2DMatrixTest {
    findKin2DMatrix fk = new findKin2DMatrix();
    @Test
    void findElement() {
        int k = fk.findElement(new int[][]{{1,2}}, 1);
    }
}