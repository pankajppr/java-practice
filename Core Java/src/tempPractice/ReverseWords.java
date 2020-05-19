package tempPractice;

public class ReverseWords {
	public static void main(String[] args){
		String sentence = "Hi! My Name is Pankaj";
		String reverseSentence = "";
		
		//using split
		for(String str:sentence.split(" ")){
			reverseSentence = str + " " + reverseSentence;
		}
		System.out.println("Reversed using Split: "+reverseSentence);
		
		//using Array
		char[] sentenceArray = sentence.toCharArray();
		String reverseString = "";
		String tempString="";
		for(char ch : sentenceArray){
			if(ch != ' '){
			tempString = tempString+ch;
			}
			else{
			reverseString = tempString + " " + reverseString;
			tempString = "";
			}
		}
		reverseString = tempString + " " + reverseString;
		
		System.out.println("Reverse Using toCharArray: "+ reverseString);
		
	}
}
