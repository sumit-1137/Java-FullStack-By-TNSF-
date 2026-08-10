package Thread;

class A extends Thread {
	public void run() {
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(i);
			} catch (Exception e) {
				System.out.println("handled");
				// TODO: handle exception
			}
			
		}
		
	}
}
public class Demo {
	public static void main(String[] args) {
		/*
		 * Thread t = new Thread();
		 * 
		 * System.out.println(t.getState()); t.start();
		 * System.out.println(t.getState());
		 */
		
		
		A a = new A();
		
		System.out.println(a.getState());
		
		a.start();
		System.out.println(a.getState());
		
		//get name 
		System.out.println(a.getName());
		
		Thread t = new Thread();
		t.setName("ADDS"); // set name 
		System.out.println(t.getName());//get name 
		System.out.println("ID "+t.getId());//get ID
		System.out.println(Thread.currentThread().getName()); //main 
		System.out.println(Thread.currentThread().getPriority()); // default 5    high low 
	}
}
