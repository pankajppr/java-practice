package testRun;


class Node{
	String val;
	Node next;
	Node(String val){
		this.val=val;
		next=null;
	}
}
class LinkedList{
	Node first;
	LinkedList(){
		first = null;
	}
	void addFirst(String val){
		Node newNode = new Node(val);
		newNode.next = first;
		first = newNode;		
	}
	Node removeFirst(){
		Node removed = first;
		first = first.next;
		return removed;
	}
	public String toString(){
		StringBuilder sb = new StringBuilder();
		sb.append("[ ");
		Node node = first;
		while(node.next != null){
			sb.append(node.val+", ");
			node=node.next;
		}
		sb.append(node.val+" ]");
		return sb.toString();
	}
}
public class ReverseLinkedList {

	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.addFirst("a"); l.addFirst("b"); l.addFirst("c"); l.addFirst("d");
		System.out.println(l);
		System.out.println("Reversing the linkedList:");
		
		Node node = l.first;
		Node prev = null;
		Node temp;
		while(node.next != null){
			temp = node.next;
			node.next = prev;
			prev = node;
			node = temp;
		}
		node.next = prev;
		l.first = node;
		System.out.println(l);

	}

}
