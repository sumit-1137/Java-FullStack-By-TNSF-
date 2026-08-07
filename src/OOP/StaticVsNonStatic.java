package OOP;

class Demo {
	 static int bal = 1000;
	 
	 void AddBal(long amt ) {
		 
		 System.out.println("Added Amount : "+amt );
		 
		 long newbal = bal+amt;
		 System.out.println("Total bal :"+newbal );
	 }
	 void show() {
		 
		 System.out.println("Show balance :"+bal);
	 }
}
public class StaticVsNonStatic {
	public static void main(String[] args) {
		
		Demo d = new Demo();
		d.AddBal(1000);
		
		d.show();
		
		
		
		
	}
	

}
