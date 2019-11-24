package linkedlist;

/**
 * Created by Anjais on 11/23/19.
 */
public class ReverseRecursion {
    public void reverse(Node node){
        if(node.next==null){
            return;
        }
        reverse(node.next);
        System.out.println(node.val);
    }
}
