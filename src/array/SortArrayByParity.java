package array;

/**
 * Created by Anjais on 11/11/19.
 */
//Given an array A of non-negative integers, return an array consisting of all the even elements of A,
// followed by all the odd elements of A.  [3,1,2,4]
public class SortArrayByParity {

    private static void paritySort(int[] arr){
        int low =0 ; int high = arr.length-1;
        int k =0;
        while(low <= high){
            if(arr[k] %2 == 0){
                low++;
                k++;
            } else{
                swap(arr, low, high);
                high--;
            }
        }
    }

    private static void swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void main(String[] args){
        int [] arr = {3,1,2,4};
        paritySort(arr);
        for(int i =0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}

