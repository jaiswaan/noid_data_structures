package array;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Anjais on 5/7/20.
 */
public class LongestSubstring {

    //Brute Force
    public int lengthOfLongestSubstring(String s) {
      int n = s.length();
        int max =0;
        for(int i=0; i< n; i++){
            for(int j=i+1; j<=n; j++){

                if( isUnique(s, i, j) ){
                   max = Math.max(max, j-i);
                }
            }
        }
        return max;
    }

    public static boolean isUnique(String s, int start, int end){
        Set<Character> set  = new HashSet<>();

            for (int i = start; i < end; i++) {
                Character ch = s.charAt(i);
                if (set.contains(ch)) return false;
                set.add(ch);
            }
            return true;


    }


    public static int slidingWindow(String s){
        Set<Character> set  = new HashSet<>();

        int n = s.length();
        int ans =0;
        for(int i=0; i<n ; i++ ){

            for(int j=i+1; j<=n; j++){

            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j-i);
            }else{
                set.remove(s.charAt(i++));
            }

            }
        }
        return ans;
    }


}
