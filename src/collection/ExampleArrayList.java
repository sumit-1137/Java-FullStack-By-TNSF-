package collection;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

class Employee {
	int id;
	String name;
	int sal;

	public Employee() {

	}

	public Employee(int id, String name, int sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", sal=" + sal + "]";
	}
	
	

}


public class ExampleArrayList {	 

	public static void main(String[] args) {

		/*
		 * List <Integer >list = Arrays.asList(1,2,13,5,12); //asList
		 * System.out.println(list);
		 * 
		 * 
		 * for(Object i : list) { System.out.println((Integer)i); }
		 * 
		 * 
		 * Collections.sort(list); System.out.println(list);
		 * 
		 * List <String>listOfStrings = Arrays.asList("Sumit","Sham","Ram");
		 * System.out.println(listOfStrings);
		 * 
		 * System.out.println(); for (String str : listOfStrings) {
		 * System.out.println(str); }
		 * 
		 * Collections.sort(listOfStrings); System.out.println(listOfStrings);
		 */
		
		List <Employee> emp = new ArrayList<>();
		emp.add(new Employee(1, "sumit", 25000));
		emp.add(new Employee(2, "Ram", 25000));
		emp.add(new Employee(4, "Sai", 20000));
		emp.add(new Employee(7, "suman", 25000));
		emp.add(new Employee(8, "Ravan", 20000));
		emp.add(new Employee(3, "soham", 5000));
		emp.add(new Employee(6, "raj", 25000));
		
		
		/*
		 * for(Employee i : emp) { System.out.println(i); }
		 */
		
		for (int i = 0; i < emp.size(); i++) {
			System.out.println(emp);
			
		}
		
	//	Collections.sort(emp);  //cannot work
	}

}
