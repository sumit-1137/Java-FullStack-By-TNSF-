package OOP;


class X extends Object {
	void show() {
		System.out.println("Class X Extend from Class Object ");
	}
}



public class ObjectExample {
	

	public static void main(String[] args) {
		
		X x1 = new X();
		x1.show();
		System.out.println(x1.toString());
		
		
		
	}

}
