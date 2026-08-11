package Thread;


class P extends Thread{
	synchronized public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
			
		}
	}

	
}

class Q extends Thread{
	synchronized public void run() {
		for (int i =11; i <= 20; i++) {
			System.out.println(i);
			
		}
	}

	
}

class R extends Thread{
	synchronized public void run() {
		for (int i = 21; i <= 30; i++) {
			System.out.println(i);
			
		}
	}

	
}
public class ThreadPiorityExample3 {
	
	public static void main(String[] args) {
		
		P p = new P();
		Q q = new Q();
		R r = new R();
		
		p.start();
		q.start();
		r.start();
		
		p.setPriority(10);
		q.setPriority(5);
		r.setPriority(1);
		
		try {
			p.join();
			q.join();
			r.join();
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

}
