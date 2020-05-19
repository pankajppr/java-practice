package tempPractice;

public class BestWayStringObj {

	public static void main(String[] args) {
		String first = "abc";
		String second = "abc";
		String third = "abc";
		
		String strObj = new String("abc");
		
		System.out.println("first==second: "+first==second);
		System.out.println("first == third: "+first==third);
		System.out.println("first == strObj: "+first==strObj);
		System.out.println(first.equals(strObj));

	}

}
