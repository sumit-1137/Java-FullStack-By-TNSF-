package Thread;

class Counter {
	int cnt = 0;
	
	synchronized void increment() {
		cnt ++;
		
	}
}

class Mythread extends Thread{
	Counter c;
	
	//constructor 
	public Mythread(Counter c) {
		super();
		this.c = c;
	}
	
	public void run() {
		for(int i =0;i<1000;i++) {
			c.increment();
			
		}
	}

	
}
public class DemoExample1 {
	
	public static void main(String[] args) {
		
		Counter counter = new Counter();
		System.out.println(counter.cnt);
		
		Mythread mythread1 = new Mythread(counter);
		Mythread mythread2 = new Mythread(counter);
		mythread1.start();
		mythread2.start();
		try {
			
			mythread1.join();
			mythread2.join();
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		System.out.println(counter.cnt);
		
	}

}
