package cs339hw3;

public class Iterative {
	 static Node number;
//create data and node:next 	 
	    static class Node {
	 
	        int data;
	        Node next;
	 
	        Node(int d) {
	            data = d;
	            next = null;
	        }
	    }
	 
	    // Function to reverse the linked list 
	    //have three prev, current, and next
	    Node reverse(Node node) {
	        Node prev = null;
	        Node current = node;
	        Node next = null;
	        while (current != null) {
	            next = current.next;
	            current.next = prev;
	            prev = current;
	            current = next;
	        }
	        node = prev;
	        return node;
	    }// change the order of the linked list
	 
	    // prints content of double linked list
	    void printList(Node node) {
	        while (node != null) {
	            System.out.print(node.data + " ");
	            node = node.next;
	        }
	    }
	 
	    public static void main(String[] args) {
	    	Iterative list = new Iterative();
	        list.number = new Node(10);
	        list.number.next = new Node(15);
	        list.number.next.next = new Node(8);
	        list.number.next.next.next = new Node(27);
	         
	        System.out.println("Input is :");
	        list.printList(number);
	        number = list.reverse(number);
	        System.out.println("");
	        System.out.println("Output is : ");
	        list.printList(number);
	    }
	}