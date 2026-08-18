package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Demo {
	public static void main(String[] args) {
		
		List<Integer>list = Arrays.asList(45,52,57,96,52,211);
		
		
		
		/*
		 * List even = new ArrayList(); List odd = new ArrayList();
		 * 
		 * for(Integer n : list) { if(n%2 == 0) { even.add(n); }else { odd.add(n); } }
		 * 
		 * for(Integer n : even) { System.out.println(n + " ");
		 * 
		 * }
		 * 
		 * for(Integer n : list) { System.out.println(odd);
		 * 
		 * }
		 */
		
		
		Stream<Integer >stream = list.stream();
		Predicate<Integer> p = a -> a%2 ==0 ? true :false;
		stream.filter(p);
		System.out.println();
	}

}
