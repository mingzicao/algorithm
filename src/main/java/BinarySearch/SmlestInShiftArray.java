package BinarySearch;
// 1 2 3 4 5
// 2 3 4 5 1
public class SmlestInShiftArray
{
    public int shiftPosition(int[] array) {
        if (array == null || array.length == 0) {
            return -1;
        }
        if (array.length ==  1) {
            return 0;
        }
        int l = 0;
        int r = array.length -1;
        while (l < r-1) {
            int mid = l + (r - l)/2;
            if (array[mid] > array[r]) {
                l = mid;
            } else {
                l = mid;
            }
        }
        if (array[r] < array[l]) {
            return r;
        }
        return l;  // no shift array;
    }
}
