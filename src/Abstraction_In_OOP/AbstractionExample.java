package Abstraction_In_OOP;


abstract class Car{
	 abstract void start();
	 
	 void show() {
		 System.out.println("detais of car ");
	 }
	 
}
 class Honda extends Car{
	 void start() {
		 System.out.println("Honda Will Start..");
	 }
	
}
 
 class Audi extends Car{
	 void start() {
		 System.out.println("Audi will start ");
	 }
 }
public class AbstractionExample {
	public static void main(String[] args) {
		
		Car honda  = new Honda();
		Car audi = new Audi();
		
		honda.start();
		audi.start();
		
		
		
	}

}
