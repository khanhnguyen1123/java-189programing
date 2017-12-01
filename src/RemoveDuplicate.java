import java.util.HashSet;
import java.util.Random;

/*
 * Author: khanhNguyen1123
 * Date: 11/30/2017
 * problems: remove duplicates from an unsorted Linked List
 */
public class RemoveDuplicate {
	
	
	public static void main(String[] args) {
	
		LinkedListNode listAddAtBeginning = new LinkedListNode();
		LinkedListNode listAddAtTheEnd = new LinkedListNode();
		int temp;
		Random rand = new Random();
		
		for (int i=0;i<15;i++){
			temp = rand.nextInt(11);
			listAddAtBeginning.push(temp);
			listAddAtTheEnd.appendToTail(temp);
		}
		System.out.println("Print LinkedList add at the beginning:");
		listAddAtBeginning.printList();
		System.out.println("\nPrint LinkedList add at the end:");
		listAddAtTheEnd.printList();
		System.out.println("\nAfter calling removeduplicate");
		removeDups(listAddAtBeginning);
		listAddAtBeginning.printList();
	}// end main 
	
	public static void removeDups(LinkedListNode list){
		// check if empty list or only has one node in the list
		if (list == null || list.head.next == null) return;
		
		HashSet<Integer> set =  new HashSet<Integer>();
		Node temp = list.head;
		Node previous = null;
		
		while(temp !=null){
			if (set.contains(temp.data)){
				previous.next = temp.next;
			}
			else{
				set.add(temp.data);
				previous = temp;
			}
			temp = temp.next;
		}//end whileloop	
		
	}// end removedups

}// end RemoveDuplicate class

class Node{
	int data;
	Node next;
	
	public Node(int d){
		data = d;
		next = null;
	}// end Node constructor
	
}// end class Node

class LinkedListNode{
	Node head;
	
	// function to add node at beginning of lis
	public void push(int data){
		Node newNode= new Node(data);
		newNode.next =  head;
		head = newNode;
	}// end push function
	
	public void appendToTail(int d){
		Node endNode = new Node(d);
		Node temp = head;
		
		if (head == null){ // check if the list is empty
			head = endNode;
		}
		else{
			//travel to the last node of the list
			while(temp.next != null){
				temp = temp.next;
			}
			temp.next = endNode;
		}	
		
	}// end appendtotail function
	
	public void printList(){
		Node tempNode = head;
		while(tempNode != null){
			
			System.out.print(tempNode.data+" ");
			tempNode = tempNode.next;
		}
	}// end printList
	
}// end LinkedListNode

