package sets;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetsExample {
	public static void main(String[] args) {
		
		Set set = new TreeSet<>();
		
		set.add(10);
		set.add(50);
		set.add(105);
		set.add(120);
		set.add(100);
		set.add(50);
		set.add(60);
		set.add(16);
		//set.add(null);
		set.add(100);
		System.out.println(set);
	}

}
