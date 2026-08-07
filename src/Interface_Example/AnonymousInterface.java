package Interface_Example;

/*1. Greeting Application (Interface)
Problem Statement

Create an interface Greeting with the following methods:

void greet(); (abstract method)
default void welcomeMessage() (default method that prints "Welcome User")

Implement the interface using an anonymous class and display:

Welcome User
Hello! Welcome to Java Programming.*/



interface Welcome {
    void greet(); 
    
    default void welcomeMessage() {
        System.out.println("Welcome User");
    }
}

public class AnonymousInterface {
    
    public static void main(String[] args) {
        
        
        Welcome w = new Welcome() {
            @Override
            public void greet() {
                System.out.println("Hello! Welcome to Java Programming.");
            }
        }; 
        
        w.welcomeMessage();
        w.greet();
    } 
}