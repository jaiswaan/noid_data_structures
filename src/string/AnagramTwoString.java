package string;

/**
 * Created by Anjais on 11/30/19.
 */
public class AnagramTwoString {
    public static Boolean anagram(String str1, String str2){
        int result[] = new int[256];
        int noCompleted =0;
        int noUniqueChar =0;
        char array[] = str1.toCharArray();

        for(char c: array){
            if(result[c] == 0){
                ++noUniqueChar;
                result[c]++;
            }
        }

        char array2[] = str2.toCharArray();
        for(int i = 0; i< array2.length ; i++){
            char c = array2[i];
            if(result[c] == 0) return  false;
            result[c]--;
            if(result[c] == 0){
                ++noCompleted;
                if(noCompleted == noUniqueChar){
                    return i ==str2.length()-1;
                }
            }
        }



        return false;
    }

    public static void main(String[] args){
        String str1 = "abc";
        String str2 = "cba";
        System.out.println(anagram(str1,str2));
    }


}
