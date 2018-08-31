package cs339hw3;

public class Recursive {
 
    static Node Num;
 
    static class Node {
 //create data and node:next
        int data;
        Node next;
 
        Node(int d) {
            data = d;
            next = null;
        }
    }
 
    // A simple and tail recursive function to reverse
    // a linked list.  Previous is passed as NULL initially.
    Node reverseUtil(Node curr, Node prev) {
 
        // If last node mark it Num
        if (curr.next == null) {
            Num = curr;
 
            // Update next to previous node 
            curr.next = prev;
            return null;
        }
 
        // Save current to next node for recursive call 
        Node next1 = curr.next;
 
        // and update next node
        curr.next = prev;
 
        reverseUtil(next1, curr);
        return Num;
    }
 
    // prints content of double linked list
    void printList(Node node) {
        while (node != null) {
            System.out.print(node.data + " ");
            node = node.next;
        }
    }
 
    public static void main(String[] args) {
        Recursive list = new Recursive();
        list.Num = new Node(10);
        list.Num.next = new Node(15);
        list.Num.next.next = new Node(8);
        list.Num.next.next.next = new Node(27);
     
 
        System.out.println("Input is :");
        list.printList(Num);
        Node res = list.reverseUtil(Num, null);
        System.out.println("");
        System.out.println("");
        System.out.println("output is : ");
        list.printList(res);
    }
}
