package Basics;

public class DivisibleCkeck {
 public static void main(String[] args) {
	
	 int num = 18;
	 if(num%2 == 0 && num %4 ==0) {
		 System.out.println("Divisible by 2 and 4 ");
	 }
	 else if (num %2 == 0) {
		 System.out.println(" Not Divisible by 2  ");
	 }
	 else if (num %4 == 0) {
		 System.out.println(" Not Divisible by 4  ");
	 }
	 else {
		 System.out.println(" Not Divisible by 2 & 4  ");
	 }
}
}
