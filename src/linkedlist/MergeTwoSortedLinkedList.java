package linkedlist;

/**
 * Created by Anjais on 11/28/19.
 */
public class MergeTwoSortedLinkedList {

    public static Node mergeSortedList(Node nodeA, Node nodeB){
        if(nodeA == null) return nodeB;
        if (nodeB == null) return nodeA;
        if(nodeA.val < nodeB.val){
            nodeA.next = mergeSortedList(nodeA.next, nodeB);
            return nodeA;
        }else {
            nodeB.next = mergeSortedList(nodeA, nodeB.next);
            return nodeB;
        }
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
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(8);

        LinkedList linkedList1 = new LinkedList();
        linkedList1.add(4);
        linkedList1.add(6);
        linkedList1.add(7);
        linkedList.print(mergeSortedList(linkedList.head, linkedList1.head));

    }
}
