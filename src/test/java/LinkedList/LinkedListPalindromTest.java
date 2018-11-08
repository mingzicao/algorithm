package LinkedList;

import org.junit.jupiter.api.Test;

class LinkedListPalindromTest {
    LinkedListPalindrom lp = new LinkedListPalindrom();

    @Test
    void isPalindrome() {
        ListNode h1 = ListNode.buildLinkedListFromArray(new int[] {1,2,2,1});
        boolean b = lp.isPalindrome(h1);
        System.out.println(b);
    }

    @Test
    void isPalindrome1() {
        ListNode h1 = ListNode.buildLinkedListFromArray(new int[] {1,2,1});
        boolean b = lp.isPalindrome(h1);
        System.out.println(b);
    }

    @Test
    void isPalindrome2() {
        ListNode h1 = ListNode.buildLinkedListFromArray(new int[] {1});
        boolean b = lp.isPalindrome(h1);
        System.out.println(b);
    }

    @Test
    void isPalindrome3() {
        ListNode h1 = ListNode.buildLinkedListFromArray(new int[] {1,2,3,4});
        boolean b = lp.isPalindrome(h1);
        System.out.println(b);
    }
    @Test
    void isPalindrome4() {
        ListNode h1 = ListNode.buildLinkedListFromArray(new int[] {1,2,1,3,4,7});
        boolean b = lp.isPalindrome(h1);
        System.out.println(b);
    }

    @Test
    void isPalindrome5() {
        ListNode h1 = ListNode.buildLinkedListFromArray(new int[] {1,2,3});
        boolean b = lp.isPalindrome(h1);
        System.out.println(b);
    }

    @Test
    void isPalindrome6() {
        ListNode h1 = ListNode.buildLinkedListFromArray(new int[] {1,2,2,2,2});
        boolean b = lp.isPalindrome(h1);
        System.out.println(b);
    }

    @Test
    void compare() {
        ListNode n1 = ListNode.buildLinkedListFromArray(new int[] {2,2});
        ListNode n2 = ListNode.buildLinkedListFromArray(new int[] {2,1});
        boolean b = lp.compare(n1, n2);
        System.out.println(b);


    }

    //int[]{1,2,2})
}