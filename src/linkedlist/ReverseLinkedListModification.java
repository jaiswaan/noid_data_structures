package linkedlist;

/**
 * Created by Anjais on 11/23/19.
 */
public class ReverseLinkedListModification {

    public static Node reverse(Node head){
        Node current = head;
        Node prev = null;
        Node next = head;
        while(current != null){
            next  = current.next;
            //current pointing to previous node
            current.next = prev;

            prev = current;
            current = next;
        }
        return prev;
    }


    public static Node reverseUsingTmpNode(Node head){
        Node prev = null;
        Node current = head;
        while (current!=null){
            Node tmp = current.next;
            current.next = prev;
            prev = current;
            current = tmp;
        }
        return prev;
    }

    public static void print(Node head)
    {
        Node temp = head;
        while (temp != null) {
            // print node data
            System.out.printf("%d->", temp.val);
            // assign temp link to temp
            temp = temp.next;
        }
    }

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        for (int i=0; i<6; i++){
            linkedList.add(i);
        }
        print(linkedList.head);
        System.out.println();
        print(reverseUsingTmpNode(linkedList.head));
    }
}
