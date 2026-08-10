package Exception;

class Bank{
	
	//deccan Exception 
	
	void withDraw(int amt ) throws Exception{
		System.out.println("Withdrow Successfully Amount = "+ amt);
	}
	
	void ATM(int amt ) throws Exception{
		System.out.println("ATM is Processing ");
		withDraw(amt);
	}
	void bank(int amt ) throws Exception{
		System.out.println("Bank is connecting to server ");
		ATM(amt);
		
	}
}
public class ExceptionExample2 {
	
	public static void main(String[] args) {
		
		Bank b= new Bank();
		
		try {
			b.bank(20000);
		} catch (Exception e) {
			System.out.println("Handle");
			
		}
		
	}

}
