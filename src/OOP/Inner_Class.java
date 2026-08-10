package OOP;

class A{
	void show() {
		System.out.println("Outer  Class ");
		};
	
	 class B{
		 
		 void show() {
			System.out.println("Inner Class ");
			};
	}
	 
	 class C{
		 void show(){
			 System.out.println("Class C");
		 }
	 }
	
}

public class Inner_Class {
	
	public static void main(String[] args) {
		
		A obj = new A();
		obj.show();
		
	
		
		
	  A.B obj1 = new A().new B(); 
	  obj1.show();
	 
		
		A.C ac = new A().new C();
		ac.show();
		
		 
	}

}
