package collections;
import java.util.*;
class HashMapTreeMap 
{
	public static void main(String[] args) throws InterruptedException
	{
	//HashMap hm = new HashMap();
		HashMap<Integer, Float> tm = new HashMap<Integer, Float>();

	  System.out.println("Size is "+ tm.size());
	  System.out.println("Content is "+ tm);

	  //Adding values to TreeMap(tm)

	  tm.put(new Integer(101),new Float(50667.525));
	  tm.put(new Integer(101),new Float(560667.5));
	  tm.put(new Integer(105),new Float(506457.678));
	  tm.put(new Integer(104),new Float(10667.5));
	  tm.put(new Integer(103),new Float(5000.8));
	  tm.put(new Integer(205),new Float(5000.8));
	  tm.put(20, 30.8f);// autoboxing
	  tm.put(new Integer(103),new Float(4000.8)); // This will override the previous key-value pair
	  
	  Collection c = tm.values();
	  System.out.println("Values "+c);
	  
      
	  System.out.println("Details after adding data in the TreeMap");
	  Thread.sleep(2000);
	  System.out.println("Size is "+ tm.size());
	  System.out.println("Content is "+ tm);

	  System.out.println("Extracting data from Collection framework variable using entrySet()");
      Thread.sleep(2000);

	  Set s = tm.entrySet();
	  System.out.println("Set Content is "+ s);
	  Iterator itr = s.iterator();

	  while(itr.hasNext())
		{
	     Map.Entry me = (Map.Entry)itr.next();
	     Integer io = (Integer) me.getKey();
		 Float fo = (Float) me.getValue();

		 int accno = io.intValue();
		 float bal = fo.floatValue();

		 Thread.sleep(100);
		 System.out.println("Account:"+accno + "  Balance :" +bal);
	  
	    }
		

		System.out.println("Extracting data from Collection framework variable using toArray()");
        Thread.sleep(1500);
		s = tm.keySet();
		Object[] obj = s.toArray();

		for (int i=0;i<obj.length ;i++ )
		{
			Object vobj = tm.get(obj[i]);

			Integer io = (Integer)obj[i];
			Float fo = (Float)vobj;

			int accno = io.intValue();
		    float bal = fo.floatValue(); 

			
		 Thread.sleep(100);
		 System.out.println("Account:"+accno + "  Balance :" +bal);
		}
		
		System.out.println("Extracting data from Collection framework variable for");
        Thread.sleep(1500);
        for(Map.Entry entry: tm.entrySet()){
         System.out.println(entry.getKey() + "->" + entry.getValue());
        }


  }//main()
}//class
