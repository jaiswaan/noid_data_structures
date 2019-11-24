package linkedlist;

import java.util.Stack;

/**
 * Created by Anjais on 11/23/19.
 */

public class StackLinked {
    Node head = null;

    //head --> null
    //tmp --> head
    //head => tmp
    public void insert(int x){
        Node tmp = new Node(null, x);
        tmp.next = head;
        head = tmp;
    }

    public void delete(){
        if(head == null) return;
        head = head.next;
    }

    public void print()
    {
        Node temp = head;
        while (temp != null) {
            // print node data
            System.out.printf("%d->", temp.val);
            // assign temp link to temp
            temp = temp.next;
        }
    }


    public void reverse(Node node){
        if(node.next==null){
            return;
        }
        reverse(node.next);
        System.out.println(node.val);
    }

    /*public void stackReverse(Stack stack, Node node){
        if(node==null){
            return;
        }
        stack.add(node.val);
        stackReverse(stack,node.next);
        System.out.println(stack.pop());
    }
    */
    public static void main (String[] args){
        StackLinked stackLinked = new StackLinked();
        stackLinked.insert(5);
        stackLinked.insert(4);
        stackLinked.insert(3);
        stackLinked.insert(2);
        stackLinked.insert(1);
       // stackLinked.delete();
       //  stackLinked.print();
        //stackLinked.stackReverse(new Stack(), stackLinked.head);
        stackLinked.reverse(stackLinked.head);
    }


}
