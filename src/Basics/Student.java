package Basics;
import java.util.*;

public class Student {

	public static void main(String argc[]) {
		Scanner sc = new Scanner(System.in);
		
		 
		System.out.print("Enter marks :");
		int marks = sc.nextInt();
		 
		 if(marks >= 90 && marks <=100) {
			 System.out.println("A+ ");
		 }
		 else if (marks >= 80 && marks <90) {
			 System.out.println("A ");
		 }
		 else if (marks >= 65 && marks <80) {
			 System.out.println("B ");
		 }
		 
		 else if (marks >= 35 && marks <65) {
			 System.out.println("C");
		 }
		 
		 else {
			 System.out.println("Fail ");
			 
		 }
		
		
		
		
	}
}
