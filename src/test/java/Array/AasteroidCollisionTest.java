package Array;

import Array.AasteroidCollision;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AasteroidCollisionTest {
    private AasteroidCollision ast = new AasteroidCollision();
    @Test
    void asteroidCollision() {
        int[] input = new  int[] {5, 10, -5};
        int[] output = ast.asteroidCollision(input);
        assertArrayEquals(new int[] {5, 10}, output);
    }
    @Test
    void asteroidCollision1() {
        int[] input = new  int[] {5, 10, -15};
        int[] output = ast.asteroidCollision(input);
        assertArrayEquals(new int[] {-15}, output);
    }
    @Test
    void asteroidCollision2() {
        int[] input = new  int[] {15, 10, -15};
        int[] output = ast.asteroidCollision(input);
        assertArrayEquals(new int[]       {}, output);
    }
    @Test
    void asteroidCollision3() {
        int[] input = new  int[] {5, -5, -15, 15};
        int[] output = ast.asteroidCollision(input);
        assertArrayEquals(new int[] {}, output);
    }
    @Test
    void asteroidCollision4() {
        int[] input = new  int[] {5, 10, 5, 15};
        int[] output = ast.asteroidCollision(input);
        assertArrayEquals(new int[] {5, 10, 5, 15}, output);
    }
}