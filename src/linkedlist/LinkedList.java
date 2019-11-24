package linkedlist;

/**
 * Created by Anjais on 11/23/19.
 */
public class LinkedList {
    Node head = null;

    public void add(int data){
        if(head == null) head = new Node(null, data);
        else{
            Node temp = head;
            while(temp.next != null){
                temp = temp.next;
            }
            temp.next = new Node(null,data);
        }
    }

}