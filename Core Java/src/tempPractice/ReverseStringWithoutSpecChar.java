package tempPractice;

public class ReverseStringWithoutSpecChar {
  public static void main(String[] args){
	  String iStr = "abdh,$ka,p,$";
	  char[] iCharArr = iStr.toCharArray();
	  for(int p=0, q= iCharArr.length-1; p<=q;){
		  char cl = iCharArr[p];
		  char cr = iCharArr[q];
		  if(cl<65 || cl>122 || (cl>90 && cl<97)){
			  p++; continue;
		  }
		  if(cr<65 || cr>122 || (cr>90 && cr<97)){
			  q--; continue;
		  }
		  char temp = iCharArr[p];
		  iCharArr[p] = iCharArr[q];
		  iCharArr[q] = temp;
		  q--;p++;
	  }
	  System.out.println("Reversed Alphabetical Array to String: "+ new String(iCharArr));
	  //Another approach for achieving the same would be copying only the alphabetical characters to another array and then reversing it then replacing initial array
	  
	  String abc = "abcdefi";
	  char[] abcAr = abc.toCharArray();
	  for(int i=0,j=abcAr.length-1; i<=j;i++,j--){
		  char temp = abcAr[i];
		  abcAr[i] = abcAr[j];
		  abcAr[j]=temp;
	  }
	  System.out.println(new String(abcAr));
  }
}
