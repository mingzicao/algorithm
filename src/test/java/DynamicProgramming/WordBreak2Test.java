package DynamicProgramming;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class WordBreak2Test {
    WordBreak2 wb = new WordBreak2();

    @Test
    void wordBreak() {
        String s =  "pineapplepenapple";
        String[] wordDict = new String[] {"apple", "pen", "applepen", "pine", "pineapple"};
        List<String> list = new ArrayList<>();
        for (String w : wordDict) {
            list.add(w);
        }
        wb.wordBreak(s,list);
    }
}