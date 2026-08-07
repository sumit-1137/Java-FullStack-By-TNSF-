package Interface_Example;

interface Emp{
	int SalDetails(int sal );
	
}

/*
 * class Developer implements Emp{ public int SalDetails(int sal) {
 * //System.out.println("Developer Salary is "+sal); return sal + 5000; } }
 * 
 * 
 * class Tester implements Emp{ public int SalDetails(int sal) {
 * //System.out.println("Tester Salary is "+sal); return sal + 5000; } }
 */


public class Function_interface {
	public static void main(String[] args) {
		/*
		 * Developer d1 = new Developer(); int Salary = d1.SalDetails(30000);
		 * System.out.println(Salary);
		 */
		
		Emp e1 = new Emp();
		e1.SalDetails(3000);
		
		
	}

}
