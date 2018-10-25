package DynamicProgramming;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordBreak1Test {
    private WordBreak1 d = new WordBreak1();
    @Test
    void test1 () {
        String [] input = {"bob", "dog" , "apple"};
        String s = "bobdog";
        boolean x = d.isWord(input,s);
        assertTrue(x);
    }
    @Test
    void test2 () {
        String [] input = {"bob", "dog" , "apple"};
        String s = "bobbobdog";
        boolean x = d.isWord(input,s);
        assertTrue(x);
    }
    @Test
    void test3 () {
        String [] input = {"bob", "dog" , "apple"};
        String s = "apple";
        boolean x = d.isWord(input,s);
        assertTrue(x);
    }

    @Test
    void test4 () {
        String [] input = {"bob", "dog" , "apple"};
        String s = "appleb";
        boolean x = d.isWord(input,s);
        assertTrue(!x);
    }
    @Test
    void test5 () {
        String [] input = {};
        String s = "appleb";
        boolean x = d.isWord(input,s);
        assertTrue(!x);
    }

    @Test
    void test6 () {
        String [] input = {};
        String s = "";
        boolean x = d.isWord(input,s);
        assertTrue(x);
    }
    @Test
    void test7 () {
        String [] input =  { "i", "like", "sam", "sung", "samsung", "mobile", "ice",
                "cream", "icecream", "man", "go", "mango"};
        String s = "ilikesamsung";
        boolean x = d.isWord(input,s);
        assertTrue(x);
    }


}