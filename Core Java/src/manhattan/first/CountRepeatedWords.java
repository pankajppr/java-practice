package manhattan.first;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

//Count the repeated or duplicate words from file.
public class CountRepeatedWords {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		try{
		File f = new File("C:/Users/Pankaj/Documents/Java/Core Java/src/file.txt");
		FileReader fr = new FileReader(f);
		BufferedReader bfr = new BufferedReader(fr);
		String line = null;
		while((line = bfr.readLine()) != null){
			String[] str = line.split(" ");
			for(String val: str){
				if(!map.containsKey(val)){
					map.put(val, 1);
				}
				else{
					map.put(val, map.get(val)+1);
				}
			}
		}
		}
		catch(FileNotFoundException fnfe){
			fnfe.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
		finally{
	
		}
		for(Map.Entry me: map.entrySet()){
			if(((Integer)me.getValue())> 1){
				System.out.println("Duplicate String:"+me.getKey());
			}
		}
	}

}
