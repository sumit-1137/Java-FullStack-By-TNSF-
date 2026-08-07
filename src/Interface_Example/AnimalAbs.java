package Interface_Example;

/*2. Animal Sound (Abstract Class)
Problem Statement

Create an abstract class Animal with:

abstract void makeSound();
void eat() (prints "Animal is Eating")

Create an anonymous class representing a Dog and display:

Animal is Eating
Dog says: Bark Bark
*/

interface Animal{
	abstract void makeSound();
	
	default void eat() {
		System.out.println("Animal is Eating");
	}
	
	
}
public class AnimalAbs {
	
	public static void main(String[] args) {
		Animal Dog = new Animal() {
			public void makeSound() {
				System.out.println("Bark Bark ");
			}
		};
		
		Dog.eat();
		Dog.makeSound();
		
	}

}
