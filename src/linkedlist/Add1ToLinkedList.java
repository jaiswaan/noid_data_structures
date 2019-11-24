package linkedlist;

/**
 * Created by Anjais on 11/23/19.
 */
public class Add1ToLinkedList {


    public static int addRecursive(Node node){
        if(node == null) return 1;
        int sum = node.val + addRecursive(node.next);
        node.val = sum % 10;
        int carry = sum/10;
        return carry;
    }

    public static int tailRecursion(Node node, int carry){
        if(node == null) return 0;
        else
        node.val = node.val + carry % 10;
        return tailRecursion(node.next == null ? null : node.next,  carry + node.val/10);
    }

    public static Node addOneToEnd(Node head){

        //int carry = addRecursive(head);
        int carry = tailRecursion(head, 1);
        if(carry > 0){
            Node tmp= new Node(null, carry);
            tmp.next = head;
            return tmp;
        }
        return head;
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
        System.out.println();
    }

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(3);
        linkedList.add(8);
        linkedList.add(9);
        Node result = addOneToEnd(linkedList.head);
        print(result);

    }


}
