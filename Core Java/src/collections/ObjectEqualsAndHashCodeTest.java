package collections;
import java.util.*;
public class ObjectEqualsAndHashCodeTest {

	public static void main(String[] args) {
		Contact contact1 = new Contact(1, "Pankaj", "9741741716");
		Contact contact2 = new Contact(1, "Ravi", "9741741716");
		Contact contact3 = contact1; // one reference pointing to another reference
		Contact contact4 = new Contact(1, "Pankaj", "9741741716"); // same data but another object is created
		//We know that contact1 and contact4 is same but we are getting false output for them, to acheive that ve override equals and hashcode method
		
		// Test using ==
		/*System.out.println("Are contact1 and contact2 (==): "+(contact1 == contact2));
		System.out.println("Are contact3 and contact1 (==):  "+(contact3 == contact1));
		System.out.println("Are contact1 and contact4 (==):  "+(contact1 == contact4));
		
		// Test using equals()
		System.out.println("Are contact1 and contact2 (equals):  "+contact1.equals(contact2));
		System.out.println("Are contact1 and contact3 (equals):  "+contact1.equals(contact3));
		System.out.println("Are contact1 and contact4 (equals):  "+contact1.equals(contact4));*/
		
		List<Contact> list = new ArrayList<Contact>();
		list.add(contact1);
		list.add(contact2);
		
		Set<Contact> set = new HashSet<Contact>();
		set.add(contact1);
		set.add(contact2);
		
		if(set.contains(new Contact(1, "Pankaj", "9741741716"))){ //if(list.contains(contact3)) will return true
			System.out.println("YES");
		}
		else{
			System.out.println("NO");
		}
		

	}

}
