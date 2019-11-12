package array;

/**
 * Created by Anjais on 11/11/19.
 */
public class BinarySearchLastInstance {

    private static int lastInstance(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] == key){
                start = mid;
            }
            else if(arr[mid] > key){
                end = mid -1 ;
            }else{

                start = mid + 1;
            }
        }
        return arr[end] == key ? end : -1;

    }

    private static int firstInstance(int[] arr, int key) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end){
            int mid = start + (end - start)/2;
            if(arr[mid] == key){
                end = mid;
            }
            else if(arr[mid] > key){
                end = mid -1 ;
            }else{
                start = mid + 1;
            }
        }
        return arr[start] == key ? start : -1;

    }

    public static void main(String[] args){
        int[] arr = { 1, 2, 3, 3, 3, 4, 5};
        System.out.println(lastInstance(arr, 3));
    }



}
