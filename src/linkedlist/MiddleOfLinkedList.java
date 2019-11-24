package linkedlist;

/**
 * Created by Anjais on 11/23/19.
 */
public class MiddleOfLinkedList {
    public static Node middleNode(Node head){
        Node slow = head;
        Node fast = head;
        if(head!=null){
            while (fast !=null &&  fast.next !=null){
                fast = fast.next.next;
                slow = slow.next;
            }
        }
        return slow;
    }



    public static void main (String[] args){
        StackLinked stackLinked = new StackLinked();
        /*stackLinked.insert(10);
        stackLinked.insert(9);
        stackLinked.insert(8);
        stackLinked.insert(7);
        stackLinked.insert(6);*/
        stackLinked.insert(5);
        stackLinked.insert(4);
        stackLinked.insert(3);
        stackLinked.insert(2);
        stackLinked.insert(1);
        System.out.println(middleNode(stackLinked.head).val);

    }

}
