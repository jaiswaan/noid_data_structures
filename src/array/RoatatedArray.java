package array;

/**
 * Created by Anjais on 11/11/19.
 */
//Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.
// (i.e., [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2])
    // find no. of rotation
public class RoatatedArray {

    private static int rotationFunc(int[] arr) {
        int start = 0, end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                return mid + 1;
            }
            if (arr[start] > arr[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(rotationFunc(arr));
    }
}
