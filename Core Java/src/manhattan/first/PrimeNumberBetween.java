package manhattan.first;
//WAP to print prime no between 100 to 200.
public class PrimeNumberBetween {

	public static void main(String[] args) {
		for(int i=100; i<=200; i++){
			for(int j=2; j<i; j++){
				if(i%j == 0) break;
				if(j == i-1) System.out.println("Found Prime:"+i);
			}
		}
	}

}
