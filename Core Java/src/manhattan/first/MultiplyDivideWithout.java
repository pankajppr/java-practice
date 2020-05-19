package manhattan.first;
//WAP to multiply or divide a number by 2 without using * or / operator.
public class MultiplyDivideWithout {

	public static void main(String[] args) {
		int number = 20;
		System.out.println("Multiply by 2:"+ (number<<1)); // if 20<<2 ==>(20*2^2) 80, similarly <<3 ==> (20*2^3)160
		System.out.println("Division by 2:"+ (number>>1)); // >>2 ==> (20/2^2)5
	}

}
