package Array;

import java.util.LinkedList;

/*
*
* Given a string with only character 'a' and 'b',
* replace some of the characters such that the string
* becomes in the forms of all the 'b's are on the right side of all the 'a's.

Determine what is the minimum number of replacements needed.

time: O(n^2) if use a stack
space O(n)

time: O(n) if use a counter;
space: O(n)

* */
public class ReplaceAofB {
    public int minReplacements(String input) {
        if (input.length() <= 1) {
            return 0;
        }
        char[] array = input.toCharArray();
       int[] replaceB = countReplaceLtoRCounter(array);
       int[] replaceA = countReplaceRtoLCounter(array);
       int min = array.length;
        for (int j = 0; j < array.length; j++) {
            int replace = replaceA[j] + replaceB[j];
            min = Math.min(min, replace);
        }
        return min;
    }

    private int[] countReplaceRtoLCounter(char[] array) {

        int[] replaceA = new int[array.length];
        int i = array.length-1;
        int counter = 0;
        while (i >= 0) {
            if (array[i] == 'a') {
                replaceA[i] = (i == array.length-1) ? 0 : replaceA[i+1];
                counter++;
            } else {
                int prev = (i == array.length-1 ) ? 0 : replaceA[i+1];
                replaceA[i] = prev + counter;
                counter = 0;
            }
            i--;
        }
        return replaceA;
    }
    private int[] countReplaceLtoRCounter(char[] array) {
        int[] replaceB = new int[array.length];
        int i = 0;
        int counter = 0;
        while (i < array.length) {
            if (array[i] == 'b') {
                replaceB[i] = (i == 0) ? 0 : replaceB[i-1];
                counter++;
            } else {
                // b b a a
                int prev = (i == 0) ? 0 : replaceB[i-1];
                replaceB[i] =prev + counter;
                counter = 0;
            }
            i++;
        }
        return replaceB;
    }
    private int[] countReplaceRtoLStack(char[] array) {
        LinkedList<Character> stack2 = new LinkedList<>();
        int[] replaceA = new int[array.length];
        int i = array.length-1;
        while (i >= 0) {
            if (array[i] == 'a') {
                replaceA[i] = (i == array.length-1) ? 0 : replaceA[i+1];
                stack2.offerFirst(array[i]);
            } else {
                int prev = (i == array.length-1 ) ? 0 : replaceA[i+1];
                while (!stack2.isEmpty()) {
                    prev++;
                    stack2.pollFirst();
                }
                replaceA[i] = prev;
            }
            i--;
        }
        return replaceA;
    }
    private int[] countReplaceLtoRStack(char[] array) {
        int[] replaceB = new int[array.length];
        int i = 0;
        LinkedList<Character> stack1 = new LinkedList<>();
        while (i < array.length) {
            if (array[i] == 'b') {
                replaceB[i] = (i == 0) ? 0 : replaceB[i-1];
                stack1.offerFirst(array[i]);
            } else {
                // b b a a
                int prev = (i == 0) ? 0 : replaceB[i-1];
                while (!stack1.isEmpty()) {
                    prev++;
                    stack1.pollFirst();
                }
                replaceB[i] = prev;
            }
            i++;
        }
        return replaceB;
    }
}
// result  a b is ok

//  a b a a a   ->  a a a a a  : 1

//  b a b b b   -> b b b b b : 1

// input : [ a b a b a ]
// replace 1:  scan from left to right, see how many ops need if replace b of a
// prevb = stack || b a   replace = 2;
// ->  a a a a a

// replace 2: scan from right to left, see how many a need to replace by b
//  if (array[i] is a and there is a b on the top of the stack), pop the b and increace replace by one
// prevA || a
// cur = b  replace = 1; pop top a;
//