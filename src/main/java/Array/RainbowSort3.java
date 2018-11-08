package Array;

public class RainbowSort3 {
    public int[] rainbowSortIII(int[] array, int k) {
    //    Given an array of balls with k different colors denoted by numbers 1- k, sort the balls.
        rainbowSort(array, 0, array.length-1,1,  k);
        return  array;

    }
    private void rainbowSort(int[] array, int begin, int end, int s, int k){
        if ( s == k ) {
            return;
        }
        int mid = s + (k-s)/2; // 1,2,3 -> mid = 2       1   2  |   3
        int i = begin;  int j = end;
        while (begin <= end) {
            if (array[begin] <= mid) {
                begin++;
            } else if (array[end] > mid){
                end--;
            } else {
                swap(array, begin++, end--);
            }
        }
        rainbowSort(array, i, end, s, mid);  //  1 -> mid
        rainbowSort(array, begin, j, mid+1, k);  // mid -> k

    }
    private void swap(int[] array, int i , int j) {
        int tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    public static void main (String[] args) {
        int x = 3/2;
        System.out.print(x);
    }
}
