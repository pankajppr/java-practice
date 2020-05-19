package intermediate;
// Write a program to find out substring in given string in java
public class FindSubString {

	public static void main(String[] args) {
		String inputString="aadttigercaCd";
        String searchSubString="tiger";
        
        char[] s_str_arr = searchSubString.toCharArray();
        char[] i_str_arr = inputString.toCharArray();
        
        int index = 0;
        for(int i=0; i<i_str_arr.length; i++){
        	if(i_str_arr[i]==s_str_arr[0]){
        		index=i;
        		int temp_index=i;
        		for(int j=0;j<s_str_arr.length;temp_index++,j++){
        			if(i_str_arr[temp_index]==s_str_arr[j]){
        				continue;
        			}
        			else index=0;
        		}
        	}        	
        }
        
        if(index>0) System.out.println("Found at Index:"+index); 
        else System.out.println("Not in the string");

	}

}
