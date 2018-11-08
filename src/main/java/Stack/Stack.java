package Stack;

import java.util.LinkedList;

public class Stack {
    public static void printStack(LinkedList<Integer> s1) {
        LinkedList<Integer> s2 = new LinkedList();
        while (!s1.isEmpty()) {
            int x = s1.pollFirst();
            s2.offerFirst(x);

        }
        System.out.print(" || ");
        while (!s2.isEmpty()) {
            int x = s2.pollFirst();
            System.out.print(x+ " ");
            s1.offerFirst(x);
        }
        System.out.println();

    }
    public static void makeStack(LinkedList<Integer> s , int[] array) {
        for (int a : array) {
            s.offerFirst(a);
        }
    }
}
