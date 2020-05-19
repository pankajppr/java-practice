package ccInterview;

import java.util.HashSet;
import java.util.Set;

import ccInterview.LinkedList.Node;

class LinkedList{
	Node head;
 protected class Node{
	 int value;
	 Node next;
	 Node(int value) { 
	 this.value=value;
	}
 }
	LinkedList(){
		head=null;
	}
	
	void addFirst(int value){
		Node newNode = new Node(value);
		newNode.next = head;
		head = newNode;
	}
	void displayLinkedList(){
		Node node = head;
		while(node.next !=null){
			System.out.print(node.value+"->");
			node=node.next;
		}
		System.out.print(node.value);
	}
}
public class RemoveDupsLinkedList {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.addFirst(4);ll.addFirst(3); ll.addFirst(5);ll.addFirst(5);ll.addFirst(3);
		//Display linked List
		System.out.println("Before Removing Duplicates:");
		ll.displayLinkedList();
		Set<Integer> set = new HashSet<>();
		Node node = ll.head;
		while(node.next != null ){
			if(!set.contains(node.value)) set.add(node.value);
			
			Node temp = node.next;
			while(set.contains(temp.value)){
				temp = temp.next;
			}
			node.next=temp;
			node=node.next;
		}
		System.out.println();
		System.out.println("After Removing Duplicates:");
		ll.displayLinkedList();
	}

}
