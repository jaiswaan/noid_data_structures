package array;

/**
 * Created by Anjais on 11/11/19.
 */
//For this problem, your goal is to sort an array of 0, 1 and 2's but you must do this in place, in linear time and without any extra space (such as creating an extra array). This is called the Dutch national flag sorting problem. For example, if the input array is [2,0,0,1,2,1] then your program should output [0,0,1,1,2,2] and the algorithm should run in O(n) time.
public class DutchNationalFlag {


   //  Create a low bound and high bound of the array.
   //  Create a reader pointer that iterates through each element.
   //  If the element at arr[r] is a 2, then swap arr[r] and arr[high] and decrease the high pointer by 1.
   //  If the element at arr[r] is a 0, then swap arr[mid] and arr[low] and increase the low and mid pointers by 1.
   //  If the element at arr[r] is a 1, don't swap anything and just increase the mid pointer by 1.


    private static void func(int[] arr){
        int low =0; int high = arr.length-1;
        for(int r = 0; r < arr.length -1; r++){
            if(arr[r] == 2){
                swap(arr,r, high);
                r++;
                high--;
            }
            else if(arr[r] == 0){
                swap(arr, low,r);
                r++;
            }
            else if(arr[r] == 1){
                r++;
            }
        }
    }

    private static void swap(int[] arr, int a, int b){
        int tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void main(String[] args){
        int [] arr = {2,0,0,1,2,1};
        func(arr);
        for(int i =0; i< arr.length-1; i++){
            System.out.println(arr[i]);
        }
    }
}
