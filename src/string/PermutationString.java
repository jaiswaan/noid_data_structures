package string;

import java.util.ArrayList;

/**
 * Created by Anjais on 11/30/19.
 */
public class PermutationString {
    public static ArrayList<String> getPermutedString(String str){
        ArrayList<String> result = new ArrayList<>();
        if(str == null) return null;
        else if(str.length() == 0) {
            result.add("");
            return result;
        }

        char first = str.charAt(0);
        String remainder = str.substring(1);
        ArrayList<String> words = getPermutedString(remainder);

        for(String word: words) {
            for (int j = 0; j <= word.length(); j++) {
                result.add(insertChar(word, first, j));
            }
        }
        return result;

    }

    public static String insertChar(String word, char c, int location){
        String start = word.substring(0);
        String end = word.substring(location);
        return start + c + end;
    }

    public static void main(String[] args){
       for(String str: getPermutedString("abc")){
           System.out.println(str);
       }
    }

}
