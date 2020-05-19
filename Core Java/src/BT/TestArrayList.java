package BT;
import java.util.*;
class TestArrayList
{
	public static void main(String[] args)
	{
	        List list = new ArrayList();
	        list.add(new Node(10));
	        list.add(new String("Harsh"));
	        list.add(new Integer(5));
	 
	        System.out.println(list.get(1)); 
	        System.out.println(list.get(2));
	}
}

class Node{
	int x;
	Node(){
		
	}
	Node(int x){
		this.x = x;
	}
}