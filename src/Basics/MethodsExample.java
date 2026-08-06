package Basics;
import java.util.*;
public class MethodsExample {
	static int  add(int a, int b) {	
		return  a+b;
	} 
	
	static int  sub(int a, int b) {		
			return  a- b;
		} 
	
	static int  mul(int a, int b) {	
		return  a * b;
	} 
	
    static int  div(int a, int b) {
		
		return  a/b;
	} 


	 public static void main(String[] args) {
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Enter the Number  1");
		 int num1 = sc.nextInt();
		 
		 System.out.println("Enter the Number 2 ");
		 int num2 = sc.nextInt();
		 
		 System.out.println("1.add\n2.subtract\n3.multiply\n4.division");
		 System.out.println("Enter Your Choice ");
		 
		 int ch = sc.nextInt();
		 
		 switch(ch) {
		 case 1 :
			 int ans= add(num1,num2);
			 System.out.println(ans);
			 
			 break;
		 case 2 :
			int res = sub(num1,num2);
			 System.out.println(res);
			 break;
			 
		 case 3 :
			 int multi = mul(num1,num2);
			 System.out.println(multi);
			
			 break;
		 case 4 :
			int division =  div(num1,num2);
			System.out.println(division);
			 break;
			 
		 default :{
			 System.out.println("Invalid case");
		 }		 }
		 
			/*
			 * int ans =add(10,20); System.out.println(ans);
			 */
		
	}
}
