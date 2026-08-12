package comparatorInterface.java;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Employee {
	int id;
	String name;
	float sal;
	
	public Employee(int id, String name, float sal) {
		
		this.id = id;
		this.name = name;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Employee : id=" + id + ", name=" + name + ", sal=" + sal ;
	}
	
	
	
	
}

public class EmployeeS {
public static void main(String[] args) {
	List emp = new ArrayList<>();
	
	emp.add(new Employee(1,"ram",46584));
	emp.add(new Employee(2,"sham",46584));
	emp.add(new Employee(3,"Sumit",46584));
	emp.add(new Employee(4,"Kiran",46584));
	emp.add(new Employee(5,"rahul",46554));
	
	System.out.println(emp);
	
	for (Object obj : emp) {
		System.out.println(obj);
	}
	
	Collections.sort(emp);
	for (Object obj : emp) {
		System.out.println(obj);
	}
	
 }
}
