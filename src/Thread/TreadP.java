package Thread;


class A1 extends Thread{
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			
		}
	}

	
}

class B1 extends Thread{
	public void run() {
		for (int i= 11; i <= 20; i++) {
			System.out.println(i);
			
		}
	}
}

class C1 extends Thread{
	public void run() {
		for (int i= 21; i <= 30; i++) {
			System.out.println(i);
			
		}
	
}
public class TreadP {

	public static void main(String[] args) {
		
		AA a = new AA();
		B1 b = new B1();
		C1 c = new C1();
		
		a.start();
		b.start();
		c.start();
		
		a.setPriority(10);
		b.setPriority(5);
		c.setPriority(1);
		try {
			a.join();
			b.join();
			c.join();
			
		} catch (Exception e) {
			System.out.println("Handled");
		}
			// TODO: handle exception
		}

    }
}
