package tempPractice;

public class DecimalToBinaryToDecimal {

	public static void main(String[] args) {
		
		int decimal = 23;
		String binary="";
		while(decimal>0){
			int remainder = decimal%2;
			decimal = decimal/2;
			binary = remainder+binary;
		}
		System.out.println("Binary:"+ binary);
		
		int binaryInt = (int)Integer.parseInt(binary);
		int  decimalValue=0;
		int counter =0;
		while(binaryInt>0){
			int modValue= binaryInt%10;
			if(modValue== 1){
				decimalValue = decimalValue + (int)Math.pow(2, counter);
			}
			counter++;
			binaryInt = binaryInt/10;
		}
		System.out.println("DecimalValue: "+ decimalValue);
	}

}
