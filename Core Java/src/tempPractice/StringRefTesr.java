package tempPractice;

public class StringRefTesr {

	public static void main(String[] args) {
		String s1="12345";

		String s2="1234" + s1.length();

		if(s1==s2) 
		{
		System.out.println("true");
		}
		else
		{
		System.out.println("false");
		}

	}

}
