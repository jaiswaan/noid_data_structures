package linkedlist;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Anjais on 11/28/19.
 */
public class RemoveZeroSum {
    //map of prefixSum and corresponding node
    private static Map<Integer, Node> map = new HashMap<Integer, Node>();

    public static Node removeZeroSum(Node head){
        int prefixSum = 0;
        Node current = head;
        Node dummy = new Node(null, 0);
        dummy.next = head;
        //Put the dummy node in map
        map.put(0, dummy);

        while(current!=null){
            prefixSum = prefixSum + current.val;

            if(map.containsKey(prefixSum)){
                //remove the entries from where the prefixSum sum is match (get prefixsum.next) upto current node
                Node tmp = map.get(prefixSum).next; //prefixSum key node in map --> next
                int sum = prefixSum;
                while (tmp!=current){
                    sum += tmp.val;
                    map.remove(sum);//tmp sum from next node keep removing in map till current node
                    tmp=tmp.next;
                }
                //map of prefixSum sum directly points to current of next and all elements are remove in between
                map.get(prefixSum).next = current.next;

            }else{
                map.put(prefixSum, current);
            }

            current = current.next;
        }
        return dummy.next;
    }

    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(-3);
        linkedList.add(3);
        linkedList.add(1);
        Node result =removeZeroSum(linkedList.head);
        linkedList.print(result);
    }
}
//https://www.youtube.com/watch?v=tss5biw6ctI