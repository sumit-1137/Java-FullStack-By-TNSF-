/*2. Addition of Two Numbers
Problem Statement

Create a functional interface Addition with the method:

int add(int a, int b);

Implement it using a lambda expression to find the sum of two numbers.

Sample Output

Addition = 30*/


package Interface_LambdaExp;

interface Addition {
    int add(int a, int b);
}


public class AdditionExp {
    public static void main(String[] args) {
       
        Addition addition = (a, b) -> a + b;

        
        int num1 = 10;
        int num2 = 20;
        int sum = addition.add(num1, num2);

        
        System.out.println("Sum  is: " + sum);
    }
}