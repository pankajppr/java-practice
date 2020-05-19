package testRun;

import java.util.ArrayList;
import java.util.List;

public class ArrayListFindMissing {

	public static void main(String[] args) {
			List list1 = new ArrayList();
			list1.add(1);list1.add(2);list1.add(3);list1.add(4);
			List list2 = new ArrayList();
			list2.add(1);list2.add(3);list2.add(4);
			System.out.println(list1);
			System.out.println(list2);
			
			List list3 = new ArrayList();
			list3.addAll(list1);
			list3.removeAll(list2); // This method will reove all the elements from this list which are present in argument
			System.out.println(list3);
			System.out.println("".length());
	}
		 static String testCharCount(String input){	
			StringBuilder result = new StringBuilder();
			if(input.length()==0) return "";
		
			char[] charArr = input.toCharArray();
			String charStrTemp = String.valueOf(charArr[0]);
			int count = 1;
			for(int i=1; i<charArr.length; i++){
			    if(String.valueOf(charArr[i]).equals(charStrTemp)){
			        count++;
			    }
			    else{
			        result.append(charStrTemp+count);
			        charStrTemp = String.valueOf(charArr[i]);
			        count = 1;
			    }
			}
			if(count>1){
			    result.append(charStrTemp+count);
			}
			return result.toString();
		 }
}
