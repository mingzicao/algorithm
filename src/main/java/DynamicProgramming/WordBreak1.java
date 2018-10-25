package DynamicProgramming;

import java.util.*;

// pre process all the sub string of sentence, which is the sub-problem
// Time O(n^2)
// Space O(n^2)

public class WordBreak1 {
    public boolean isWord(String[] dict, String sentence) {
        Set<String> set = makeSet(dict);
        //    char[] array = sentence.toCharArray();
        int len = sentence.length();
        boolean[][] M = new boolean[len][len];
        fillM(M, sentence, len, set);
        boolean[] N = new boolean[len+1];
        N[0] = true; // empty is true;
        //N[i] represnets that the [0 : i] is sentence;
        for (int i = 1; i < N.length; i++) {
            for (int j = 0; j < i; j++) {
                if (N[j] && set.contains(sentence.substring(j,i))) {
                    N[i] = true;
                    break;
                }
            }
        }
        return N[len];
    }
    private Set<String> makeSet(String[] s) {
        Set<String> set =  new HashSet<String>();
        for (String s1 :s) {
            set.add(s1);
        }
        return set;
    }
    private void fillM(boolean[][] M, String sentence, int len, Set<String> set) {
        for (int i = 0; i < len; i++) {
            for (int j = i; j < len; j++) {
                if (set.contains(sentence.substring(i,j+1))) { // begins at i, end index is j (including j)
                    M[i][j] = true;
                } else {
                    M[i][j] = false;
                }
            }
        }
//        for (boolean[] r : M) {
//            for (boolean b : r) {
//                System.out.print(b + " ");
//            }
//            System.out.println();
//        }
    }

}