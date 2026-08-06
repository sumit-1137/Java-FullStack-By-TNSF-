package OOP;
import java.util.*;

// Abstract Base Class
abstract class Employee {
    private int id;
    private String name;
    protected double sal; 
    private String dep;
	 
    public Employee(int id, String name, double sal, String dep) {
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.dep = dep;
    }

    // Getter for Name to facilitate the search function
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", Total Salary=" + calculateSalary() + ", Dep=" + dep + "]";
    }

    // Abstract method to force subclasses to implement their own salary logic
    public abstract double calculateSalary();
}

// Subclasses overriding the abstract calculateSalary method
class Developer extends Employee {
    public Developer(int id, String name, double sal, String dep) {
        super(id, name, sal, dep);
    }

    @Override
    public double calculateSalary() {
        return sal + 10000; // Developers get a flat ₹10,000 bonus
    }
}

class Tester extends Employee {
    public Tester(int id, String name, double sal, String dep) {
        super(id, name, sal, dep);
    }

    @Override
    public double calculateSalary() {
        return sal + 5000; // Testers get a flat ₹5,000 bonus
    }
}

class Manager extends Employee {
    public Manager(int id, String name, double sal, String dep) {
        super(id, name, sal, dep);
    }

    @Override
    public double calculateSalary() {
        return sal + (sal * 0.20); // Managers get a 20% performance bonus
    }
}

// Main Driver Class
public class Emp_Man_Sys {
    public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        Employee empArr[] = new Employee[3]; // Array size set to 3 for testing
		
        System.out.println("--- Enter Employee Details ---");
        for (int i = 0; i < empArr.length; i++) {
            System.out.println("\nEntering details for Employee " + (i + 1) + ":");
            
            System.out.print("Select Role (1: Developer, 2: Tester, 3: Manager): ");
            int role = sc.nextInt();
            
            System.out.print("Enter ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // Clear buffer
            
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            
            System.out.print("Enter Base Salary: ");
            double sal = sc.nextDouble();
            sc.nextLine(); // Clear buffer
            
            System.out.print("Enter Department: ");
            String dep = sc.nextLine();
            
            // Runtime Polymorphism: Instantiate specific subclass based on input
            if (role == 1) {
                empArr[i] = new Developer(id, name, sal, dep);
            } else if (role == 2) {
                empArr[i] = new Tester(id, name, sal, dep);
            } else if (role == 3) {
                empArr[i] = new Manager(id, name, sal, dep);
            } else {
                System.out.println("Invalid role choice. Defaulting to Developer.");
                empArr[i] = new Developer(id, name, sal, dep);
            }
        }
		
        // Print all records
        System.out.println("\n--- Employee List ---");
        for (Employee emp : empArr) {
            System.out.println(emp);
        }
        
        // Search functionality
        System.out.print("\nEnter the name of the employee to search: ");
        String searchName = sc.nextLine();
        
        boolean found = false;
        System.out.println("\n--- Search Results ---");
        for (Employee emp : empArr) {
            // Case-insensitive comparison for user convenience
            if (emp.getName().equalsIgnoreCase(searchName)) {
                System.out.println("Employee Found: " + emp);
                found = true;
            }
        }
        
        if (!found) {
            System.out.println("No employee found with the name: " + searchName);
        }
        
        sc.close();
    }
}
