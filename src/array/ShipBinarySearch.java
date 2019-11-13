package array;

/**
 * Created by Anjais on 11/11/19.
 */
//https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/
    //Input: weights = [1,2,3,4,5,6,7,8,9,10], D = 5
public class ShipBinarySearch {
    // Sum = 1+2+3+4+5+6+7+8+9+10 =55
    //mid = 27 --> pair = (1,2,3,4,5,6) (7,8,9) (10) --> not fill move end to mid
    //low = 0, end = 27
    //mid = 13 --> pair = (1,2,3,4) (5,6) (7) (8) (8) (10) not = d = 5 over kill move low to mid
    // low = 13, end = 27
    //mid = 20 --> pair = (1,2,3,4,5) (6,7) (8,9) (10) --> not fill move end to mid
    // low = 13 end = 20
    //mid =16  -->  pair = (1,2,3,4,5) (6,7) (8) (9) (10) --> d = 5 still check another min weight

    //low = 13 end = 16
    //mid = 14 --> pair (1,2,3,4) (5,6) (7)  (8) (9) (10)  not = d =5 over kill move low to mid
    // low = 14 end = 16
    //mid = 15 --> pair (1,2,3,4,5) (6,7) (8) (9) (10) --> d = 5 min wieght.


    private static int shipWithinDays(int[] weights, int D) {
        // use binary search to find the optimal weight
        int start = 0, end = 0;
        int sum = 0;
        for(int i =0 ; i< weights.length; i++){
            sum += weights[i];
        }
        start = 0;
        end = sum;
        while (start < end) {
            int mid = start + (end-start)/2;
            int d = checkCapacity(weights, mid);
            if (d>D) {
                start = mid+1;
                //Question why to do start = mid+1 why not mid only;
            } else {
                end = mid;
            }
        }
        return start;
    }

    // check whether can ship under the given D and capacity
    private static int checkCapacity(int[] weights, int capacity) {
        int day = 1, w = 0;
        for (int i = 0; i < weights.length; i++) {
            if (w + weights[i] > capacity) {
                w = weights[i];
                day++;
            } else {
                w += weights[i];
            }
        }
        return day ;
    }

    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(shipWithinDays(arr,5));
    }
}

