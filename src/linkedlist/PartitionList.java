package linkedlist;

/**
 * Created by Anjais on 11/23/19.
 */
/*
Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

Example:

Input: head = 1->4->3->2->5->2, x = 3
Output: 1->2->2->4->3->5
 */
public class PartitionList {


    public static Node partition(Node head, int x){
        Node smallerNode = new Node(null,0);
        Node largerNode = new Node(null, 0);
        Node smallerHead = smallerNode;
        Node largerHead = largerNode;
        Node current = head;
        while (current!=null){
            if(current.val < x){
                smallerNode.next = new Node(null,current.val);
                //forget to move small pointer
                smallerNode = smallerNode.next;
            }else {
                largerNode.next = new Node(null, current.val);
                largerNode = largerNode.next;
            }
            current = current.next;
        }
        smallerNode.next =largerHead.next;
        return smallerHead.next;
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
        System.out.println("Null");
    }

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(4);
        linkedList.add(3);
        linkedList.add(2);
        linkedList.add(5);
        linkedList.add(2);

        print(partition(linkedList.head, 3));
    }
}
