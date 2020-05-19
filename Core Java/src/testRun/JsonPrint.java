package testRun;
import java.util.*;
public class JsonPrint {

	public static void main(String[] args) {
		Map m = new HashMap();
		m.put("name", "Pankaj");
		m.put("Age", 29);
		m.put("Profession", "Developer");
		Map addr = new HashMap();
		addr.put("city", "Bangalore");
		addr.put("pin", 560066);
		addr.put("Country", "India");
		m.put("Address", addr);
		
		StringBuilder json = new StringBuilder("{\n");		
		
		Set s = m.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()){
			Map.Entry entry = (Map.Entry)itr.next();
			Object key = entry.getKey();
			json = json.append("\""+key.toString()+"\" : ");
			Object value = entry.getValue();
			if(value instanceof Map){
				jsonifyValye((Map)value,json);
			}
			else{
				json = json.append("\""+value.toString()+"\"");
				if(itr.hasNext()){
					json.append(",\n ");
				}
			}
			
		}
		json = json.append("}");
		System.out.println(json);

	}
	
	private static void jsonifyValye(Map map, StringBuilder json) {
		json.append("	{\n");
		Set s = map.entrySet();
		Iterator itr = s.iterator();
		while(itr.hasNext()){
			Map.Entry entry = (Map.Entry)itr.next();
			Object key = entry.getKey();
			json = json.append("\""+key.toString()+"\" : ");
			Object value = entry.getValue();
			if(value instanceof Map){
				jsonifyValye((Map)value,json);
			}
			else{
				json = json.append("\""+value.toString()+"\"");
				if(itr.hasNext()){
					json.append(",\n ");
				}
			}
			
		}
		json.append("},\n");
	}

}
