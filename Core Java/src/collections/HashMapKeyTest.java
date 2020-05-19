package collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapKeyTest {
	public static void main(String[] args){
		Map<TestObject, String> map = new HashMap<>();
		map.put(null, "Null");
		map.put(null, "NullAgain");
		map.put(new TestObject("Pank",11), "FirstObj");
		map.put(new TestObject("Pank",11), "FirstObj");
		map.put(new TestObject("Pank",11), "FirstObj");
		map.put(new TestObject("Pank",11), "SecondObject");
		map.put(new TestObjectChild(), "ChildClass"); // A child class object can go into the parent class map key
		System.out.println(map);
		System.out.println(map.get(new TestObject("Pank",11)));
	}
}
class TestObjectChild extends TestObject{}
 class  TestObject{
	String name;
	int age;
	TestObject(){
		
	}
	TestObject(String name, int age){
		this.name = name;
		this.age = age;
	}
	abstract class TestObjectAbstractChild extends TestObject{  // We can have a abstract class extend a concrete class
		
	}
	
	@Override
	public String toString(){
		return "name:"+this.name+", Age:"+this.age;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		//result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return 5;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TestObject other = (TestObject) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
	
}
