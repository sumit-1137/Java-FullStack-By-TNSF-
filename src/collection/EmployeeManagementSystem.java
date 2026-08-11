
/*Create a menu-driven application using ArrayList<Employee>.

Features:

Add employee
Display all employees
Search employee by ID
Search by name
Update salary
Update department
Delete employee
Find highest-paid employee
Find lowest-paid employee
Display employees from a particular department

Concepts: ArrayList, objects, loops, methods, get(), set(), remove(), size().*/


package collection;
import java.util.*;


class EmployeeMain{
	int id =1;
	String name = "XYZ";
	String dep = "IT";
	long sal = 652112;
	
	EmployeeMain(int id,String name,String dep,long sal){
		this.id = id;
		this.name = name;
		this.dep = dep;
		this.sal = sal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDep() {
		return dep;
	}

	public void setDep(String dep) {
		this.dep = dep;
	}

	public long getSal() {
		return sal;
	}

	public void setSal(long sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", dep=" + dep + ", sal=" + sal ;
	}
	
	
	
	
}

public class EmployeeManagementSystem {
	
	static Scanner sc = new Scanner(System.in);
	static final ArrayList<EmployeeMain> employeeList = new ArrayList<>();

	
	public static void main(String[] args) {
		
		
		
		System.out.println("1.Add employee\r\n"
				+ "2.Display all employees\r\n"
				+ "3.Search employee by ID\r\n"
				+ "4.Search by name\r\n"
				+ "5.Update salary\r\n"
				+ "6.Update department\r\n"
				+ "7.Delete employee\r\n"
				+ "8.Find highest-paid employee\r\n"
				+ "9.Find lowest-paid employee\r\n"
				+ "10.Display employees from a particular department");
		
		
		System.out.print("Enter Your Choice : ");
		int ch = sc.nextInt();
		
		do {
		
		if (ch == 1) {
			System.out.println("Adding employee ");
			addEmployee();

		} else if (ch == 2) {
			System.out.println("Display all employees ");
			showEmployee();
		} else if (ch == 3) {
			System.out.println("Search employee by ID");
		} else if (ch == 4) {
			System.out.println("Search employee by Name ");
		} else if (ch == 5) {
			System.out.println("Update salary ");
		} else if (ch == 6) {
			System.out.println("Display all employees ");
		} else if (ch == 7) {
			System.out.println("Display all employees ");
		} else if (ch == 8) {
			System.out.println("Display all employees ");
		} else if (ch == 9) {
			System.out.println("Display all employees ");
		} else if (ch == 10) {
			System.out.println("Display all employees ");
		}else if (ch == 11) {
			System.out.println("Exit");
		} 
		else {
			System.out.println("Invalid Choice ");
		}
		
		}while(ch!=11);
		
	
	
		
	}
	
	static void addEmployee() {
		System.out.print("Enter Employee Id :");
		int id = sc.nextInt();
		System.out.print("Enter Employee Name:");
		String name = sc.next();
		System.out.print("Enter Employee Department :");
		String dep= sc.next();
		System.out.print("Enter Employee Salary :");
		int sal = sc.nextInt();
		
		employeeList.add(new EmployeeMain(id, name, dep, sal));
        System.out.println("Employee added successfully!");
	}
	
	static void showEmployee() {
		System.out.println("\n--- Employee List ---");
        for (EmployeeMain emp : employeeList) {
            System.out.println(emp);
        }
	}
	
	static void searchById() {
        System.out.print("Enter Employee ID to search: ");
        int serch_id = sc.nextInt();
        
        if(serch_id != null) {
        	serch_id
        }
	}
	
	
	
	
	

}
