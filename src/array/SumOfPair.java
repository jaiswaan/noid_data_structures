package array;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

//Given array of n integers and given a number X, find all the unique pairs of elements (a,b),
//whose summation is equal to X.
//http://stackoverflow.com/questions/4720271/find-a-pair-of-elements-from-an-array-whose-sum-equals-a-given-number
public class SumOfPair {

    public static void main(String[] args){
        int[] arr = {2,3,4,5,7, 8};
        //getSumPairs(arr,10);
        //sumByPointers(arr,10);
        sumOfThreePair(arr,10);
    }

    //sum by using hashMap.
    public static void getSumPairs(int[] arr, int k){
        HashMap<Integer,Integer> sMap = new HashMap<Integer,Integer>();
        for(int i = 0; i< arr.length; i++){
            if(sMap.containsKey(arr[i])){
                System.out.println(arr[i] + " ," + sMap.get(arr[i]));
            }else{
                sMap.put(k-arr[i], arr[i]);
            }
        }

    }

    // sum by two pointers
    public static void sumByPointers(int[] arr, int k){
        Arrays.sort(arr);
        int i =0, j = arr.length-1;
        while(i<j) {
            int sum = arr[i] + arr[j];
            if (sum == k) {
                System.out.println(arr[i] + "," + arr[j] );
                i++;
                j--;
            } else if (arr[i] + arr[j] > k) {
                j--;
            } else {
                i++;
            }
        }
    }


    //Sum of three numbers a+b+c = k
    // b+c = k-a


    public static void sumOfThreePair(int[] arr, int k){
        Arrays.sort(arr);
        for(int i=0; i<arr.length; i++){
            sumByPointers(arr, k-arr[i]);
        }
    }

}

