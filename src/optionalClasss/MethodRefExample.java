package optionalClasss;

import java.util.Arrays;
import java.util.List;

public class MethodRefExample {
	public static void main(String[] args) {
		
		List <String> name = Arrays.asList("Sumit","Ram","Om","Sai");
		name.forEach(n -> System.out.println(n));
		
		System.out.println("Upper Case ");
	//	name.stream().map(n -> n.toUpperCase()).forEach(n -> System.out.println(n));
		name.stream().map(n -> n.toUpperCase()).forEach( System.out::println);
		
		System.out.println("Lower Case ");
		name.stream().map(n -> n.toLowerCase()).forEach(n -> System.out.println(n));
		name.stream().map(String::toLowerCase).forEach( System.out::println);
		
		
		
		String res = name.stream().filter(naam -> naam.contains("Om")).findFirst().orElse("Not Present");
		System.out.println("The Result is : "+res);
		
		
		
	
	}

}
