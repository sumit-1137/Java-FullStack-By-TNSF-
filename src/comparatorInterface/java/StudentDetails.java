package comparatorInterface.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
	int id;
	String name ;
	float marks ;

	public Student(int rollNo, String name, float marks) {
	
		this.id = rollNo;
		this.name = name;
		this.marks = marks;
	}

	@Override
	public String toString() {
		return "Student id=" + id + ", name=" + name + ", marks=" + marks ;
	}
	
	
	
	
	
	
}
public class StudentDetails {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add(new Student(1,"Ram",56));
		list.add(new Student(2,"Shaam",85));
		list.add(new Student(3,"Soham",51));
		list.add(new Student(4,"Manas",87));
		list.add(new Student(5,"Raj",96));
		list.add(new Student(6,"Sumit",66));
		
		
		//sort using id
		/*
		 * Comparator<Student> com = (a,b)->Integer.compare(a.id,b.id);
		 * 
		 * Collections.sort(list,com); for(Object obj :list) { System.out.println(list);
		 * }
		 */
		
		//sort using name 
		
		
		/*
		 * Comparator<Student> com1 = (
		 * a,b)->Integer.compare(a.name.length(),b.name.length());
		 * 
		 * Collections.sort(list,com1); for(Object obj :list) {
		 * System.out.println(list);
		 * 
		 * 
		 * }
		 */
		 
		
		/*
		 * Comparator<Student> com2 ;
		 * Collections.sort(list,(a,b)->Integer.compare(a.name.length(),b.name.length()?
		 * 1:-1)); for(Object obj : list ) { System.out.println(list); }
		 */
		
		// List of Value 
		List<Integer> listVal = Arrays.asList(54,46,82,74,65,25);
		
		Comparator<Integer > com4 = (a,b) ->a>b?-1:1;
		Collections.sort(listVal);
		System.out.println(listVal);
		for(Integer obj : list) {
			System.out.println(list);
		}
		
		
		
		
		
	}

}
