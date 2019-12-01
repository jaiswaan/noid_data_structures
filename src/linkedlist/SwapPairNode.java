package linkedlist;

/**
 * Created by Anjais on 11/28/19.
 */
public class SwapPairNode {

    public static void swapPairNode(Node head){
        /* There must be at-least two nodes in the list */
        if (head != null && head.next != null) {

        /* Swap the node's data with data of next node */
            reverse(head, head.next);
            swapPairNode(head.next.next);
        }
    }

    public static Node reverse(Node nodeA, Node nodeB){
       int tmp = nodeA.val;
       nodeA.val = nodeB.val;
       nodeB.val = tmp;
       return nodeA;
    }

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(4);
        linkedList.add(5);
        swapPairNode(linkedList.head);
        linkedList.print(linkedList.head);
    }
}
