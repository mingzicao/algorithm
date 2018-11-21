package String;

public class StringIsSubstring {

    public int strstr(String large, String small) {
        if (small.length() > large.length()) {
            return 1;
        }
        if (small.length() == 0) {
            return 0;
        }
        int largePrime = 101;
        int prime = 31;
        int seed = 1;

        int targetHash = small.charAt(0)%largePrime;
        for (int i = 1; i < small.length();  i++) {
            seed = moduleHash(seed,0, prime, largePrime);
            targetHash = moduleHash(targetHash, small.charAt(i), prime, largePrime);
        }

        int hash = 0;
        for (int i = 0; i < small.length(); i++) {
            hash = moduleHash(hash, large.charAt(i), prime, largePrime);
        }

        if (hash == targetHash && equals(small, large, 0)) {
            return 0;
        }

        for (int i = 1; i <= large.length() - small.length(); i++) {
            hash = nonNeg(hash - seed * large.charAt(i-1)%largePrime, largePrime);
            hash = moduleHash(hash, large.charAt(i + small.length() -1), prime, largePrime);
            if (hash == targetHash && equals(small, large, i)){
                return i;
            }
        }
        return -1;
    }
    private int nonNeg(int hash, int largePrime) {
        if (hash < 0) {
            hash += largePrime;
        }
        return hash;
    }
    private int moduleHash(int hash, int c, int prime, int largePrime) {
        hash = (hash*prime + c)%largePrime;
        return hash;
    }

    private boolean equals(String small, String large,  int s) {
        for (int i = 0; i < small.length(); i++) {
            if (small.charAt(i) != large.charAt(s+i)) {
                return false;
            }
        }
        return true;
    }

}
