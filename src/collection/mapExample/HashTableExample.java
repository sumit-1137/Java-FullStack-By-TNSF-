package collection.mapExample;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {
	 public static void main(String[] args) {
		
		 Map map = new Hashtable();
		 
		 map.put(1,"Sumit");
		 map.put(2,"Chavan");
		 map.put(4,"Sumit");
		 map.put(3,20);
		 map.put(5,10);
					// map.put(null,10);  null pointer excepting 
					 //map.put(null,null);
					 //map.put("roll no ",null);
		 map.put("Name","Ram");
		 System.out.println(map);
		 
		boolean Is_contain1 =  map.containsKey("Sumit");  // false
		System.out.println(Is_contain1);
		boolean Is_contain2=  map.containsKey("Name"); 	//true
		System.out.println(Is_contain2);
	}
}
