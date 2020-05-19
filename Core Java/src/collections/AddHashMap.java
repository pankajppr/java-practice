package collections;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AddHashMap {

	public static void main(String[] args) {
		Map<Integer, String> map1 = new HashMap();
		map1.put(1, "1");map1.put(2, "2");map1.put(3, "3");
		Map<Integer, String> map2 = new HashMap();
		map2.put(1, "a"); map2.put(2, "b"); map2.put(3,"c"); map2.put(4,"D");
		System.out.println(map1);
		System.out.println(map2);
		map2.putAll(map1);
		System.out.println(map2);
		Collections.synchronizedMap(map1);
		HashMap map3 = new HashMap();
		map3.putAll(map1);
		//map3.putAll(map2);
		System.out.println(map3);
		

	}

}
