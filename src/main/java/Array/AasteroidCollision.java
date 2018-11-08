package Array;

import java.util.Arrays;
//        Input:
//        asteroids = [5, 10, -5]
//        Output: [5, 10]
//        Explanation:
//        The 10 and -5 collide resulting in 10.  The 5 and 10 never collide.
// Time : O(n)
// Space: O(1)
public class AasteroidCollision {
    public int[] asteroidCollision(int[] ast) {
        if (ast == null || ast.length <= 1) {
            return ast;
        }
        // linear scan array. if array[i] AND last survived asteroid different sign, will collide and will put survide asteroid to the safe place;
        // the safe place can be retresent by a stack
        // the element put into the stack will not care about the collision problem
        // we care only the top the stack astroid and the next incoming asteroid
        int safe = 0; // the safe pointer is matain as the top of the stack safe, left side include safe is the remaining astroird
        int cur = 1; // the scan pointer go through all asteroid
        while (cur < ast.length) {
            if (safe == -1) {
                ast[++safe] = ast[cur++];
            } else if (ast[cur] * ast[safe] < 0) { // will collide
                if(Math.abs(ast[cur]) < Math.abs(ast[safe])){
                    cur++;  // stack top will remain; the safe wins
                } else if ( Math.abs(ast[cur]) == Math.abs(ast[safe]) ){
                    safe--; // cur and safe have same mass, both die
                    cur++;
                } else {
                    safe--; // cur wins, top of save died, and next safe will be test in next loop
                }
            } else {
                ast[++safe] = ast[cur++];
            }
        }
        return Arrays.copyOfRange(ast, 0, safe+1);
    }

}
