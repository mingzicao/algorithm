package Stack;

import java.util.*;

public class EvaluateReversePolishNotation {
    public int evalRPN(String[] array) {
        // Write your solution here
        // stack || 2 1 +  => pop 2 + 1 = 3
        // stack || 3 3 *  => pop 3 * 3 = 9
        LinkedList<Integer> stack = new LinkedList<>();
        Set<String> ops = new HashSet<>();
        ops.add("+");
        ops.add("-");
        ops.add("*");
        ops.add("/");
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (!ops.contains(array[i])) {
                stack.offerFirst(Integer.parseInt(array[i]));
            } else {
                String op = array[i];
                int a = stack.pollFirst();
                int b = stack.pollFirst();
                result = calculate(a, b, op);
                stack.offerFirst(result);
            }
        }
        return result;
    }
    private int calculate(int a, int b, String op) {
        if (op == "+") {
            return a+b;
        }
        if (op == "-") {
            return b - a;
        }
        if (op == "*") {
            return a*b;
        }
        return b/a;
    }
}
