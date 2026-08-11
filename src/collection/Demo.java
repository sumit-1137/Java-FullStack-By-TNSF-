
package collection;
import java.util.ArrayList;
import java.util.Arrays ;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class Demo {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add("Hello");
		
		System.out.println(list);
		int res =(int) list.get(3);
		System.out.println(res);
		
		String res1 =(String) list.get(4);
		System.out.println(res1);
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(i);
		}
		
		System.out.println();
		for (Object object : list) {
			System.out.println(object);
		}
		
		list.add(2, 100);  //shifting values 
		System.out.println(list.get(2));
		System.out.println(list);
		
		list.add(0, 0);  //shifting values 
		System.out.println(list.get(2));
		System.out.println(list);
		
		boolean is_content = list.contains("Hello"); //check present or not in list 
		System.out.println(is_content);
		
		list.add(Integer.valueOf(11));// wrapper boxing
		boolean b = list.contains(Integer.valueOf(11));
		System.out.println(b);
		
	     int size = list.size();  
	     System.out.println("Size of List :"+size);
		
	    Object obj =  list.getFirst();
	    System.out.println(obj);
	    
	    System.out.println(list.getClass());
	    
	    System.out.println(list.hashCode());
	     //list.forEach(null); // Consumer
	    
	    boolean is_empty = list.isEmpty();
	    System.out.println(is_empty);
	    
	    System.out.println(list.indexOf("Hello"));
	    
	    list.remove("Hello"); // hello removed  * can pass value or index
	    System.out.println(list);
	    
	    list.clear(); //clear all element from list 
	    System.out.println(list);
	}
	

}
