package Object_class_In_OOP;


class Employee{
	String name = "Sumit";
	int id = 20;
	double sal = 50000;
	String dep = "SDE";
	
	public Employee(String name,int id,double sal,String dep) {
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.dep = dep;
		
	}
	
	@Override 
	public String toString() {
		return "Name :"+name+"\n"+"Id :"+id+"\nSalary :"+sal+"\nDepartment : "+dep;
	}

}
public class EmployeeDetails {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("sham",20,2000,"ms");
		System.out.println(emp1);
	}
	
	
}
