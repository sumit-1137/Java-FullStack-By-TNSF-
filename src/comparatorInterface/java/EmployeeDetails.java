package comparatorInterface.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class EmployeeD {
	
	int id;
	String name;
	int sal;
	public EmployeeD(int id, String name, int sal) {
		
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		
		return "id=" + id + ", name=" + name + ", sal=" + sal ;
	}
	/*
	 * @Override public int compareTo(Employee that) { if(this.id >that.id) { return
	 * 1; } return -1;
	 * 
	 * }
	 */
	
	public int compareTo(EmployeeD that) {
		if(this.sal >that.sal) {
		return 1;
		}
		return -1;
	
}
	
}	
public class EmployeeDetails {
	public static void main(String[] args) {
		
		List<EmployeeD> emp = new ArrayList();
		
		emp.add(new EmployeeD(1,"ram",46584));
		emp.add(new EmployeeD(2,"sham",46584));
		emp.add(new EmployeeD(3,"Sumit",46584));
		emp.add(new EmployeeD(4,"Kiran",46584));
		emp.add(new EmployeeD(5,"rahul",46554));
		
		/*
		 * Collections.sort(emp); for(Object ob :emp) { System.out.println(ob); }
		 */
		
		//using Ananomous function exp 
		
		Comparable<EmployeeD> com = new Comparable<EmployeeD>() {

			@Override
			public int compareTo(EmployeeD that) {
				if (this.id >that.id) {
					return 1;
				}
			
			}
			
		};
		}
}


