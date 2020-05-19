interface I{
	int I=19;
}

public class Test implements I{

		final int j; // final variable can only be initialized in constructor
		int I =20;
		Test(){
			j=10;
		}
		
	public static void main(String[] args) {
		int start = 1;
		for(int i=0; i<5; i++){
			System.out.print(start+" ");
			int j = 0;
			int incr = i;
			while(j<i){
				System.out.print((start+incr)+" ");
				j++;
				start = start+incr;
			}
			System.out.println();			
		}
		B b = new B();
		b.print();
		b.printB();
		A a = b;
		a.print();
	
	}
}

class A{
	void print(){
		System.out.println("From A");
	}
}
class B extends A{
	@Override
	void print(){
		System.out.println("From B");
	}
	void printB(){
		System.out.println("From B's Print");
	}
}
