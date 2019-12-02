package string;

import java.util.HashSet;
import java.util.Set;
//https://www.programcreek.com/2012/11/top-10-algorithms-for-coding-interview/
/**
 * Created by Anjais on 12/1/19.
 */
public class NonRepeatingCharSizeK {
    public static int nonRepeatingK(String s, int k) {
        int counter = 0;
        char str[] = s.toCharArray();
        int i = 0;
        int j = 0;
        Set<Character> set = new HashSet();

        for (; j < str.length; j++) {
            if (!set.contains(str[j])) {
                set.add(str[j]);

            }else {
                while(i<j){
                    if(str[i]==str[j]){
                        i++;
                        break;
                    }
                    set.remove(str[i]);
                    i++;
                }

            }

            if (j - i + 1 > k) {
                set.remove(str[i]);
                i++;
            }
            if (j - i == k) {
                counter++;
            }
        }
        return counter;
    }
    public static void main(String[] args){
        System.out.println(nonRepeatingK("abcacd", 3));
    }
}
