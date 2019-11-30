package string;

/**
 * Created by Anjais on 11/30/19.
 */
public class UrifyString {
    //String str = "abc def"
    //new String str2 = "abc%20def"


    public static String urifyString(String str){
        int count = 0;
        for(int j=0; j < str.length()-1; j++){
            if(str.charAt(j) == ' '){
                count++;
            }
        }
        int k = str.length()+  (2 * count);
        char result[] = new char[k];
        char[] array = str.toCharArray();
        for(int i = str.length()-1; i>=0; i--){
                if(array[i] == ' '){
                    result[k] = '0';
                    result[k-1] ='2';
                    result[k-2] = '%';
                    k = k-3;
                }else {
                    result[k] = array[i];
                    k--;
                }
        }
        return String.valueOf(result);
    }

    public static void main(String[] args){
        System.out.println(urifyString("abc def"));
    }

}
