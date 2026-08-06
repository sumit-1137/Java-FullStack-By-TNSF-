package Abstraction_In_OOP;

//abstract class 
abstract class Payment{
	
	abstract void serverDetails();
	void show() {
		System.out.println("Details About Servers ..");
	}
}


class ATM extends Payment{
	void serverDetails() {
		System.out.println("Atm Server is On");
	}
}


class UPI extends Payment{
	void serverDetails() {
		System.out.println("UPI server is on ");
	}
}
public class PaymentExample {
	public static void main(String[] args) {
		//Payment p = new Payment();  can not creat Opbect of Abstract Class 
		Payment p1 = new ATM();
		Payment p2 = new UPI();
		
		p1.serverDetails();
		p2.serverDetails();
		
		
	}

}
