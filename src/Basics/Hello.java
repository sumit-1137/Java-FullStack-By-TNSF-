package Basics;

public class Hello {

	public static void main(String argc[]) {

		// hello world

		System.out.println("Hello World...! ");

		// data types
		int a = 10;
		boolean is_true = true;
		float b = 1.2f;
		double db = 65452354.54;
		char x = 'h';
		long z = 46546564;
		short y = 2;

		System.out.println(a + " " + is_true + " " + " " + db + " " + x);

		// ascii C= values
		char f = 97;
		System.out.println(a);

		// unicode
		char s = '\u0078'; // 2 byte

		// 16^3 * 0 +16^2 * 0 +16^1 * 7 +16^0 * 8 =120
		System.out.println("s :" + (int) s);

		
		  char t = '\uffff';
		  System.out.println("t :"+t);
		  
		  
		  // Tokens  smallest unit of program
			/* keyword:
			 *  operator: , 
			 *  identifire:  ,
			 *  litral: int , floating , string , char  
			 *  
			 *  */
		  
		  
		  //type casting 
		  
			/* 1. class typecasting 
			 * 
			 * 2. primitive typecasing :
			 * 		 */
		  byte n = 5; //   wide smaller to bigger 
		  int n1 = n;
		  
		  float p = 553.2f; // narrowing   (bigger to smaller )  imp\expli
		  int p1 = (int )p;
		  
		  byte o = 127;
		  System.out.println(0);  // size -128 to 127
		 
		  
		  
		 

	}
}
