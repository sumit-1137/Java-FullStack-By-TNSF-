package Thread;

class PrintValue1 extends Thread{
	public void run() {
		for (int i = 0; i <=10; i++) {
			try {
				Thread.sleep(500);
				System.out.println(i);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			}
		}
	
}

class PrintValue2 extends Thread{
	public void run() {
		for (int i = 11; i <=20; i++) {
			try {
				Thread.sleep(500);
				System.out.println(i);
			} catch (Exception e) {
				// TODO: handle exception
			}
			
			}
		}
	
}
public class MultipleTreadExample {
	
	public static void main(String[] args) {
		
		PrintValue1 val = new PrintValue1();
		PrintValue2 val1 = new PrintValue2();
		
		val.start();
		val1.start();
		
	}

}
