package intermediate;

//Exception Class for Empty LinkedList

class LinkedListEmptyException extends RuntimeException{
	public LinkedListEmptyException(){
		super();
	}
	public LinkedListEmptyException(String message){
		super(message);		
	}
}

//Node class which holds data and next, which points to the next Node
class Node{
	public int data; // data of the Node
	public Node next; // points to next node in the List
	
	public Node(int data){
		this.data=data;
	}
	public void displayNode(){
		System.out.print(data+" ");
	}
}
//LinkedList Class
class LinkedList {
	public Node first; // refer to the first Node in the List
	public LinkedList(){
		first=null;
	}
	public void insertFirst(int data){
		Node newNode = new Node(data);
		newNode.next=first;
		first=newNode;
	}
	public Node deleteFirst(){
		if(first == null){
			throw new LinkedListEmptyException("Linked List Is Empty");
		}
		Node tempNode = first;
		first = first.next;
		return tempNode;
	}
	
	public void displayLinkedList(){
		System.out.println("Displaying the Linked List");
		Node tempdisplay=first;
		while(tempdisplay != null){
			tempdisplay.displayNode();
			tempdisplay= tempdisplay.next;
		}
	}

}

public class LinkedListApp{
	public static void main(String[] args) {
		
		LinkedList ll = new LinkedList();
		ll.insertFirst(25);
		ll.insertFirst(2);
		ll.insertFirst(75);
		ll.insertFirst(234);
		ll.insertFirst(251);
		ll.insertFirst(27);
		ll.insertFirst(5);
		ll.displayLinkedList();
		//ll.deleteFirst();
		// find out middle element in LinkedList
		System.out.print("\nMiddle Element data is:");
		int counter=0;
		Node tempNode = ll.first;
		Node middle=tempNode;
		while(tempNode != null){
			counter++;
			if(counter%2 == 0){ // if(counter >= 4) for finding the third last element
				middle = middle.next;
			}
			tempNode = tempNode.next;
			
		}
		System.out.print(middle.data);
		
	}
}
