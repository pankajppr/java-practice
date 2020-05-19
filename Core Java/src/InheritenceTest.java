
class  ParentClass{
 private int val=0;
 String superString = "super";
}

public class InheritenceTest extends ParentClass{
	//String superString = "Child";
	public static void main(String[] args){
		System.out.println(new InheritenceTest().superString);
		// System.out.println(new ParentClass().val); cannot access the private property outside the context of the same class
	}
}
