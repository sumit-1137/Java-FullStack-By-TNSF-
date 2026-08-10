package Exception;
import java.util.*;


class MobileRecharge extends Exception{
	String msg;

	public MobileRecharge(String msg) {
		super();
		this.msg = msg;
	}
	
	public String getMessage() {
		return msg;
	}
} 

class Recharge{
	
	void recharge(long mobile ,float recharge_amt) throws MobileRecharge{
		if(recharge_amt >0) {
			System.out.println("processing the Recharge ");
		}else {
			throw new MobileRecharge("Invalid Recharge Amount ");
		}
		
	}
}

public class MobileRechargeException {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Mobile No. :");
		long mobileNo = sc.nextLong();
		
		System.out.print("Enter Recharge amount :");
		float rechargeAmount = sc.nextFloat();
		Recharge recharge = new Recharge();
		
		try {
			recharge.recharge(mobileNo, rechargeAmount);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		
		
	}
}
