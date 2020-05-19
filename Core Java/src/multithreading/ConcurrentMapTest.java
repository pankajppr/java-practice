package multithreading;

import java.util.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentMapTest {

	public static void main(String[] args) {
		Map m = new HashMap();
		ConcurrentMap<String, String> map = new ConcurrentHashMap<String, String>();
		map.put("abc", "abc");
		map.put("def", "def");
		ThreadLocal local;
		//Callable callable = Executors.callable(Runnable task);
		Map smap = Collections.synchronizedMap(m);
		Hashtable table;
		
		ExecutorService executerService = Executors.newFixedThreadPool(5);
	}

}
