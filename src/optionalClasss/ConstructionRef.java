package optionalClasss;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Employee{
	int id ;
	String name;
	
	public Employee( String name ) {
		//this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee id=");
		builder.append(id);
		builder.append(", name=");
		builder.append(name);
	
		return builder.toString();
	}
	
	
	
}
public class ConstructionRef {
	public static void main(String[] args) {
		
		List<String > names = Arrays.asList("Aman","Raj","Dada");
		
		List <Employee> emp = new ArrayList<>();
		
		
		/*
		 * for(String e : names) { emp.add(new Employee(e)); }
		 * 
		 * emp.forEach(n->System.out.println(n));
		 */
		
		System.out.println("Using Stream Class ");
		emp  = names.stream().map(str ->new Employee(str)).toList();
		System.out.println(emp);
		
		System.out.println("using Constructor Ref ");
		names.stream().map(Employee :: new).toList();
		for(String e : names) {
			System.out.println(e);
		}
		
		//single line 
		/*
		 * emp = names.stream().map(Employee :: new).toList();
		 * System.out.println("Example for Method refer"); //
		 * emp.forEach(System.out.println());
		 * 
		 */		
		
		
		
	}

}
