package OOP;

class Student{
	
	int rno = 20;
	String name  = "gsuhd";
	float percent = 10.66f;
	
	
	
	Student(int rno,String name ,float percent){
		this.name = name;
		this.rno =rno;
		this.percent =percent;
		
	}
	
	void Show() {
		System.out.println("Details :"+name+"| "+rno+" | "+percent);
	}
		
	}


public class ConstructorDemo {
	
	public static void main(String[] args) {
		
		Student s1 = new Student(20, "Sumit", 50);
		s1.Show();
		
	}

}
