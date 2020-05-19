package collections;
import java.util.*;
//http://beginnersbook.com/2013/12/java-arraylist-of-object-sort-example-comparable-and-comparator/
public class ArrayListSorting {
	public static void main(String args[]){
		   List<Student> arraylist = new ArrayList<Student>();
		   arraylist.add(new Student(283, "Chaitanya", 26));
		   arraylist.add(new Student(245, "Rahul", 24));
		   arraylist.add(new Student(209, "Ajeet", 32));

		   Collections.sort(arraylist, new CompareObjects());
		   //Collections.reverse(arraylist);

		   for(Student str: arraylist){
				System.out.println(str);
		   }
		}

}
