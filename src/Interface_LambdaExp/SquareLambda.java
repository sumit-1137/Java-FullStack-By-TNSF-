/*5. Square of a Number
Problem Statement

Create a functional interface Square with the method:

int square(int number);

Implement it using a lambda expression to calculate the square of a number.

Sample Output

Square = 144*/


package Interface_LambdaExp;

interface Square{
	int square(int number);
}
public class SquareLambda {
	
	public static void main(String[] args) {
		
		Square s1 = (a) -> a*a;
		 int result = s1.square(12);
		System.out.println("Square Is :"+result);
			
		}
	}
	
	

