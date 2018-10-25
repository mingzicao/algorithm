package BinarySearch;

public class Sqr {
    public int sqrt(int x) {
        int l = 1;
        int r = x/2;
        while (l < r-1) {
            int mid = l + (r-l)/2;
            int sq = mid * mid;
            if (sq == x){
                return mid;
            } else if (sq > x || sq < 0) {
                r = mid;
            } else {
                l = mid;
            }
        }
        if (r*r <= x) {
            return r;
        }
        return l;
    }
}
