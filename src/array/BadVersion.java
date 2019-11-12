package array;

/**
 * Created by Anjais on 11/11/19.
 */
public class BadVersion {

     private static Boolean isBadVersion(int version){
        if(version == 3) return  false;
        if(version == 4) return  true;
        if(version == 5) return  true;
        return  false;
     }

    public static int firstBadVersion(int n) {
        int start = 0;
        int end = n-1;
        while (start < end) {
            int mid = start + (end - start)/2;
            if (isBadVersion(mid)) {
                end = mid;
            } else {
                start = mid+1;
            }
        }
        return start;
    }

    public static void main(String[] args){

        System.out.println(firstBadVersion(5));
    }
}