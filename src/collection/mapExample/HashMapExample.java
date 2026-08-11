package collection.mapExample;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class HashMapExample {
	
	public static void main(String[] args) {
		
		Map map = new HashMap();
		map.put(1,"ram");
		map.put(2,"sham");
		map.put(3,"rahul");
		map.put(4,"raj");
	
		map.put(null,"Ravan");
		map.put(null,"Om");
		System.out.println(map.get(null));
		
		System.out.println(map);
		
		for(Object i :  map.keySet()) {
			 System.out.println(i +":"+map.get(i));			
		}
		
		BiConsumer<Integer,String> bi = new BiConsumer<>() {
			public void accept(Integer a,String b) {
				System.out.println("hello");
				
			}
			
		};
		//need to do with lambda function 
		
		/*
		 * for (int i = 0; i < map.size(); i++) { System.out.println(i +":"+map.get(i));
		 * 
		 * }
		 */
	}

}
