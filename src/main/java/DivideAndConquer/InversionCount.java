package DivideAndConquer;
/**bug */
// 4 1 , 3 2;
// 3, 0, 1 0
// inversion, a[i] > a[j] while i < j
// (4,1) (4,3) (4,2) -> 3
// (3,2) -> 1; total = 4;
// count (4,1) count(3,2) -> 2
// (1,4) (2,3)_
//    i     j
//count (1,4,2 3) // if array[i] > array[j]; count++; merge(i, j)
public class InversionCount {
    public int inversion (int[] input) {
        if (input == null || input.length == 0 ) {
            return -1;
        }
        int[] tmp = new int[input.length];
        return countInversion(input, tmp, 0, input.length-1);
    }
    public int countInversion(int[] array, int[] tmp , int l, int r) {
        if (l == r) {
            return 0;
        }
        if (l == r - 1) {
            if (array[l] > array[r]) {
                swap(array, l ,r);
                return 1;
            } else {
                return 0;
            }
        }
        int mid = l + (r - l)/2;
        int leftCount = countInversion(array, tmp, l, mid);
        int rightCount = countInversion(array, tmp,mid+1, r);
        int count = mergeAndCount(array, tmp , l, mid+1, r);
        return leftCount + rightCount + count;
    }
    public  int mergeAndCount(int[] array, int[] tmp, int l, int mid, int r) {
        for (int i = l; i <= r; i++ ){
            tmp[i] = array[i];
        }
        int i = l;
        int j = mid;
        int count = 0;
        int index = l;
        while (i < mid && j <= r) {
            if (tmp[i] > tmp[j]) {
                count ++;
                array[index++] = tmp[j++];
            }else {
                array[index++] = tmp[i++];
            }
        }

        while (i < mid) {
            array[index++] = tmp[i++];
            count = count + (r - mid+1);

        }

        return count;

    }
    private void swap(int[] array, int l, int r) {
        int a = array[l];
        array[l] = array[r];
        array[r] = a;
    }
}
