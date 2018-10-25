package DynamicProgramming;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak2 {
    public List<String> wordBreak(String s, List<String> wordDict) {
        // catsanddog cat and dog cat sand dog
        List<String> list = new ArrayList<>();
        if (s == null || s.length() == 0 || wordDict == null || wordDict.size() == 0) {
            return list;
        }
        boolean[][] M = new boolean[s.length()][s.length()];
        Set<String> wordDictSet = makeSet(wordDict);
        List<Integer> interval = preProcess(M, s, wordDictSet);
        List<String> result = new ArrayList<>();
        allPermutation(s, interval, result, new StringBuilder(), 0);
        return result;
    }
    private Set<String> makeSet(List<String> wordDict) {
        Set<String> wordDictSet = new HashSet<>();
        for (String x : wordDict) {
            wordDictSet.add(x);
        }
        return wordDictSet;
    }
    private void allPermutation(String s, List<Integer> interval, List<String> result, StringBuilder sb, int n) {
        if (n == interval.size()) {
            result.add(sb.toString());
            return;
        }
        int lastInterval = (n == 0) ? 0 : interval.get(n-1);
        sb.append(s.substring(lastInterval+1, interval.get(n)));
        allPermutation(s,interval, result, sb.append(" "),n+1);
        sb.deleteCharAt(sb.length()-1);
        allPermutation(s,interval,result,sb, n+1);
    }
    public  List<Integer> preProcess(boolean[][] M, String s, Set<String> set) {
        List<Integer> interval = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j <= i; j++) {
                if (set.contains(s.substring(j,i+1))) {
                    M[j][i] = true;
                    interval.add(i); // i, including i, is a cuting interval;
                }
            }
        }
        for (boolean[] r : M) {
            for (boolean b : r) {
                System.out.print(b + " ");
            }
            System.out.println();
        }
        System.out.println();
        for (Integer i  : interval) {
            System.out.print(i + " ");
        }
        System.out.println();
        return interval;
    }
}
