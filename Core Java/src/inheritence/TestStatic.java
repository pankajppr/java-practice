package inheritence;


class TestMyStatic {
	String str = "Hello Parent";
	String display; // a method name and a property name can be same;
	public  void display(){
		System.out.println("Hi");
	}
	
}

class TestStaticSub extends TestMyStatic{
	//String str = "Hello Child";
	public  void display(){
		System.out.println("Hello");
		System.out.println(str);
	}

}

public class TestStatic{
	public static void main(String[] args){
		//TestStaticSub.display();
		TestMyStatic parent = new TestStaticSub();
		parent.display();

	}
}