package Array;

public class LargestContainer {
    // Method 1: brute force: O(N^2) all possible container and get the max;
    public int largest(int[] array) {
        int V = 0;
        for (int i = 0 ; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                int curV = (j - i) * Math.min(array[j], array[i]);
                V = Math.max(V, curV);
            }
        }
        return V;
    }
    // Method 2: Two pointer coming to each other O(n)；
    public int largest2(int[] array) {
        int V = 0;
        int s = 0;
        int e = array.length-1;
        while (s < e) {
            int v = Math.min(array[s], array[e]) * (e - s);
            V = Math.max(V, v);
            if (array[s] < array[e]) {
                s++;
            } else {
                e--;
            }

        }
        return V;
    }
}
