package Interface_Example;

interface Collage {
	void details();
}

class Student implements Collage{
	public void details() {
		System.out.println("Student Details ");
	}
}

class Teacher implements Collage{
	public void details() {
		System.out.println("Staff Details Details ");
	}
}

class Management implements Collage {
	public void details() {
		System.out.println("Management Details Details ");
	}
	
}

public class Demo {
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.details();
		
		Teacher t1 = new Teacher();
		t1.details();
		
		Collage c1 = new Student();
		c1.details();
	}
	

}
