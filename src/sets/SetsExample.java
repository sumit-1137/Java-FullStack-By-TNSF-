//hashsets
package sets;

import java.util.HashSet;
import java.util.Set;

public class SetsExample {
	public static void main(String[] args) {
		
		Set set = new HashSet<>();
		
		set.add(10);
		set.add(50);
		set.add(105);
		set.add(120);
		set.add(100);
		set.add(50);
		set.add(60);
		set.add(16);
		set.add(null);
		set.add(100);
		System.out.println(set);
	}

}

