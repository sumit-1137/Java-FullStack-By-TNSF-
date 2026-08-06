package Basics;

import java.util.Scanner;

public class OperatorExample {
	
	public static void main(String[] args) {
		
	// logical op
	/*
	 * 1. AND 2. OR 3. NOt
	 */
		
	/*
	 * Scanner sc = new Scanner(System.in);
	 * 
	 * System.out.print("Enter number  :"); int n1 = sc.nextInt(); int n2 =
	 * sc.nextInt(); int n3 = sc.nextInt();
	 * 
	 * if(n1>n2 && n1 > n3) { System.out.println("n1 is biggestn"); }
	 * 
	 * if(n1>n2 || n1 > n3) { System.out.println("n1 is biggestn"); }
	 */
		
		//bitwise operator  and or nor not 
		/*
		 * System.out.println(2 & 4); System.out.println(3 & 3); System.out.println(2 |
		 * 4); System.out.println(2 | 4);
		 */
		
		//shift operator 
		
		/*
		 * System.out.println(2 << 4); // 010 + 0000 = 100000 = 32
		 * 
		 * System.out.println(3 >> 2); // 11 + 00 = 00 System.out.println(4<<2);
		 * 
		 * System.out.println(10>> 2);
		 */
		
		//pre increment 
		int n = 100;
		System.out.println("increment : "+n++ +" "+ n++ +" "+n++);
		
		// pre decrement 
		int m = 100;
		System.out.println("decrement : "+m-- +" "+ m-- +" "+m--);
		
	//pOST increment 
			int s = 100;
			System.out.println( ++s);
			
			// post  decrement 
			int t = 100;
			System.out.println(--t);
		
	}
	
	
	

}
