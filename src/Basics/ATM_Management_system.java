package Basics;
import java.util.*;

public class ATM_Management_system {
	
	
	static void check_bal () {
		int amt =0;
		System.out.println("Balance is : "+amt );
	}

	static void change_pin () {
		System.out.println("Enetr Your Pin :");
		Scanner sc = new Scanner(System.in);
		int pin = sc.nextInt();
	}
	
	static void withdrow() {
		System.out.println("Enetr Your amount to withdrow  :");
		Scanner sc = new Scanner(System.in);
		int amt = sc.nextInt();
		
		int total = amt ;
		
	
	}
	
	static void deposite() {
		System.out.println("Enetr Your amount to Deposite   :");
		Scanner sc = new Scanner(System.in);
		int amt = sc.nextInt();
		int total = amt ;
		System.out.println(" total :"+total);
		
	
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.Check Bal \n2.Change pin \n3.withdraw \n4.Deposite \n5.Exit");
		System.out.print("Enter your Choice :");
		int ch = sc.nextInt();
		
		
		
			switch(ch) {
			case 1 :
				check_bal();
				break;
			case 2 :
				change_pin();
				break;
				
			case 3 :
				withdrow();
				break;
				
			case 4 :
				deposite();
				break;
			case 5 :
				System.out.println("Exit Successfully");
				break;
			
			default :
				System.out.println("Invalid Input >>>!");
			}
		
		
		
		
		
	}
}
