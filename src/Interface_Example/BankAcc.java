// Bank Account (Interface)
/*Problem Statement

Create an interface BankAccount with:

void deposit(double amount);
void withdraw(double amount);
default void accountType() (prints "Savings Account")

Implement the interface using an anonymous class and perform a deposit and withdrawal operation.

Sample Output

Savings Account
Amount Deposited: 5000
Amount Withdrawn: 2000*/


package Interface_Example;

interface BankAccount{
	void deposit(double amount);
	void withdraw(double amount);
	
	default public void accountType() {
		System.out.println("Saving Account ");
		
	}
	
	
	
}
public class BankAcc {
	public static void main(String[] args) {
		
		BankAccount b = new BankAccount() {
			
			public void deposit(double amount) {
				System.out.println("Amount Deposited:"+amount);
			}
			
			public void withdraw(double amount) {
				System.out.println("Amount Withdrawn :"+amount);
			}
		};
		b.accountType();
		b.deposit(50000);
		b.withdraw(200);
		
		
		
	}

}
