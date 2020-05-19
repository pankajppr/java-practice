package tempPractice;
//Find the occurance of a character twice in a string , eg. string="abdohfgjddjoiejfffjegg", here d and g are repeated twice rest are either once or more that 2 times

public class StringRepeatPattern {
	public static void main(String[] args){
		String str ="abdohfgjddjoiejfffjegg";
		String twiceOccurance = "";
		
		char[] charArray = str.toCharArray();
		for(int i=0; i<charArray.length; i++){
			if(i<charArray.length && charArray[i] == charArray[i+1]) {
				boolean flag = true;
				char ch = charArray[i];
				i++;
				while(i<charArray.length-1 && ch == charArray[++i]){
					flag=false;
				}
				if(flag){
					twiceOccurance = twiceOccurance+ch;
				}
			}
		}
		System.out.println(twiceOccurance);
	}
}
