package BinarySearch;
// [1,2,3,50,77..max]  ->  [50,77,1,2,3........]
//                     <-  [3,50,77......max,2,1]

public class BSinShiftedArray {
    public int search(int[] array, int target) {
       if (array == null || array.length == 0) {
           return -1;
       }
       int l = 0;
       int r = array.length-1;
       while (l <= r) {
           int mid = l + (r-l)/2;
           if (array[mid] == target) {
               return mid;
           } else if (array[mid] > target) {
               if (array[mid] < array[r]) {

               }

           }
       }
       return -1;
    }
}
