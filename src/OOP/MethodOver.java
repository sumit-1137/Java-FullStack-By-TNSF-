package OOP;

class AdditionTwoNum{
	void sum(int a , int b) {
		int res = a+b;
		System.out.println("Addition is :"+res);
	}
	
	void sum(int a , int b,int c) {
		int res = a+b+c;
		System.out.println("Addition is :"+res);
	}
	
}


public class MethodOver {
	
	public static void main(String[] args) {
		
		AdditionTwoNum e1 = new AdditionTwoNum();
		e1.sum(10,20);
		e1.sum(10,20,30);
		
	}

}
