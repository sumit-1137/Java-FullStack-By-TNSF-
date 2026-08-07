/*4. Vehicle Information (Abstract Class)
Problem Statement

Create an abstract class Vehicle with:

abstract void start();
abstract void stop();
void fuelType() (prints "Fuel Type: Petrol")

Create an anonymous class for a Bike and display all methods.

Sample Output

Fuel Type: Petrol
Bike Started
Bike Stopped*/


package Interface_Example;

abstract class Vehicle{
	
	abstract void start();
	abstract void stop();
	
	void fuelType() {
		System.out.println("Fuel Type: Petrol");
	}
	
}

public class VehicalInterface {
	
	public static void main(String[] args) {
		Vehicle car = new Vehicle () {
			@Override
			 void start() {
				System.out.println("Car is Started ");
			}
			 
			@Override
			 void stop() {
					System.out.println("Car is Stopped ");
				}
		};
		car.start();
		car.stop();
		car.fuelType();
	}

	
	
}
