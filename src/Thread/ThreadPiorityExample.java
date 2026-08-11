package Thread;

class AA extends Thread{
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			
		}
	}

	
}

class BB extends Thread{
	public void run() {
		for (int i= 11; i <= 20; i++) {
			System.out.println(i);
			
		}
	}
}

class CC extends Thread{
	public void run() {
		for (int i= 21; i <= 30; i++) {
			System.out.println(i);
			
		}
	
}
public class ThreadPiorityExample1 {

	public static void main(String[] args) {
		
		AA a = new AA();
		BB b = new BB();
		CC c = new CC();
		
		a.start();
		b.start();
		c.start();
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

