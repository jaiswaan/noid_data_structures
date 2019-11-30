package string;

/**
 * Created by Anjais on 11/30/19.
 */
public class UniqueChar {

    public static Boolean unique(String string){
        int result = 0;
        char arr[] = string.toCharArray();
        for (int i=0; i< arr.length-1; i++){
              int tmp = arr[i] - 'a';
              if((result & 1<< tmp) > 0 ){
                  return false;
              }else
                  result = (result & 1 << tmp);
        }
        return true;
    }

    public static void main(String[] args){
        String str = "and";
        System.out.println(unique(str));
    }
}
