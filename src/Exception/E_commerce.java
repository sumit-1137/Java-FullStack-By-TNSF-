
package Exception;
import java.util.*;

class E_commerceOrder extends Exception{

	String msg;

	public E_commerceOrder(String msg) {
	
		this.msg = msg;
	}
	
	 public String getMessage() {
	        return msg;
	    }
	
	
}

class Order{
	
	int stock = 10;
	
	void placeOrder(int req) throws E_commerceOrder {
		if (req<stock) {
			System.out.println("Order Placed ");
			int updatedStock = stock -req;
			System.out.println("Availabe Stock :"+updatedStock);
		}else { 
			throw new E_commerceOrder("Out off Stock");
		}
		
	}
}
public class E_commerce {
	
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter Request Quantity :");
		int req = sc.nextInt();
		
		Order order = new Order();
		try {
			order.placeOrder(req);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		
	}

}
