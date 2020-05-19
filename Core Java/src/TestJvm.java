import java.util.*;
public class TestJvm {
	//Enum
	public enum Names{Pankaj, Ravi, Manish, Nelluri};
	String str1 = "Pankaj";
	public static void main(String args[]){
		new TestJvmClild().print();
		String str1 = "Pankaj";
		System.out.println(str1.equals(String.valueOf(Names.Pankaj)));// An enum value is of its type
		/************************************************************/
		
		//Different ways to initialize an array, 
		int[] arr = new int[5]; // here size is compulsory, otherwise it wont compile
		int[] arr1 = {};
		System.out.println("arr:"+arr.length+", arr1: "+arr1.length);
		/************************************************************/
		class Animal{
			int id= 7;
		}
		class Fox extends Animal{ }
		System.out.println(new Fox().getClass() == new Animal().getClass());
		/************************************************************/
		Integer ints = new Integer("5"); // throws NumberFormatException
		Integer inti = new Integer(5);
		/************************************************************/
		String str = "abachdsa";
		Set<Character> set = new LinkedHashSet<Character>();
		for(char c : str.toCharArray()){
			set.add(c);
		}
		List<Character> list = new ArrayList<>();
		list.addAll(set);
		for(int i=0; i<list.size(); i++){
			
		}
		
		/************************************************************/
		StringBuilder sb = new StringBuilder();
		sb.append(124516515); // Replace all the occurence of a particular number
		String s = String.valueOf(124516515);
		for(int i=0; i<sb.length(); i++){
			if(sb.charAt(i) == '1') 
				sb.setCharAt(i, '0');
		}
		System.out.println(sb);
		System.out.println(s);
		
		/************************************************************/
		
		for(int i=0;i<10;i++) {
	         for(int j=0;j<10-i;j++) {
	             System.out.print(" ");
	         }
	        for(int k=0;k<=i;k++) {
	            System.out.print("* ");
	        }
	        System.out.println();  
	    }
		
		 try{
			 System.out.println(1/0);
		 }
		 catch(ArithmeticException ae){
			 System.out.println("Arithmetic Ex");
			 //ae.printStackTrace(); -- This prints the line number too
			 System.out.println(ae);
		 }
	}
	
	final class MyInner{		
		public final String value;
		MyInner(String value){
			this.value = value;
		}
		
	}
	
}

class TestJvmClild extends TestJvm{
	String str1 = "Child Pankaj";
	void print(){
		System.out.println(this.str1);
		System.out.println(super.str1);
	}
}