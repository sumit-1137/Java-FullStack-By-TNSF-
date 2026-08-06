package Interface_Example;

interface Payment{
	void pay();
}

class UPI implements Payment{
	public void pay() {
		System.out.println("pay using UPI ");
	}
}

class CretidCard implements Payment{
	public void pay() {
		System.out.println("pay using Cretid Card ");
	}
}

class DebitCard implements Payment{
	public void pay() {
		System.out.println("pay using Debit Card ");
	}
}

class NetBanking implements Payment{
	public void pay() {
		System.out.println("pay using Net Banking ");
	}
}


public class InterfaceDemo {
	
	public static void main(String[] args) {
		CretidCard c = new CretidCard();
		c.pay();
		
		DebitCard d = new DebitCard();
		d.pay();
		
		Payment p = new NetBanking();
		p.pay();
		
		
		
	}

}
