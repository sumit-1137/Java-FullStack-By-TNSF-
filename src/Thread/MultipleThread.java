package Thread;


class A extends Thread{
	
	public void run() {
	for (int i = 0; i <10; i++) {
		try {
			Thread.sleep(10);
			System.out.println(i);
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		}
	}
}
public class MultipleThread {
	public static void main(String[] args) {
		
		A a = new A();
		System.out.println(a.getName());
		
		Thread t = new Thread(a);
		t.start();
		System.out.println(t.getName());
		
		
		
	}
}
