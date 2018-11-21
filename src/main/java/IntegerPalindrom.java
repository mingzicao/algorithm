public class IntegerPalindrom {
    public boolean isPalindrome(int x) {
        int X = x;
        if (x < 0) {
            return false;
        }
        int result = 0;
        while (x > 0) {
            int digit = x%10;
            result = result*10 + digit;
            x = x/10;
        }
        return result == X;
    }
}
