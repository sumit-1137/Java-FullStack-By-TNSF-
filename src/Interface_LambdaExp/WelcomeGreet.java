/*1. Greeting Application
Problem Statement

Create a functional interface Greeting with the method:

void greet();

Implement the interface using a lambda expression and display:

Welcome to Java Programming!*/


package Interface_LambdaExp;

interface Greeting {
    void greet();
}

public class WelcomeGreet {
    public static void main(String[] args) {
        // Lambda implementation of the greet() method
    	
        Greeting greeting = () -> System.out.println("Welcome to Java Programming!");

        greeting.greet();
    }
}
