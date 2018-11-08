package Array;

public class InterLeaveArray {
    public int[] interleave(int[] array) {
        if (array == null || array.length <= 1) {
            return array;
        }
        int even = 0;
        int odd = 1;
        while (even < array.length && odd < array.length) {
            if (array[even] > 0) {
                even+=2;
            } else if (array[odd] < 0) {
                odd +=2 ;
            } else {
                swap(array, even, odd);
                even+=2;
                odd +=2 ;
            }
        }
        int endEven = array.length%2 == 0 ? array.length-2 : array.length-1; // 0 1 2 3 ||    0 1 2
        int endOdd = array.length%2 == 0 ?  array.length-1 : array.length -2;   //1 2
        while (even <= endEven) {// even should be > 0
            if (array[even] > 0) {
                even += 2;
            } else if (array[endEven] < 0) {
                endEven -= 2;
            } else {
                swap(array, even, endEven);
                endEven -= 2;
                even += 2;
            }
        }
        while (odd <= endOdd) {
            if (array[endOdd]> 0) {
                endOdd -= 2;
            } else if (array[odd] < 0) {
                odd += 2;
            } else {
                swap(array, odd, endOdd);
                endOdd -= 2;
                odd += 2;
            }
        }
        return array;

    }
    private void swap(int[] array, int a, int b) {
        int tmp = array[a];
        array[a] = array[b];
        array[b] = tmp;
    }
}
