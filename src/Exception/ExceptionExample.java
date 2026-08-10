package Exception;


class ZeroException extends Exception{
	String msg ;
	
	
	//constructor
	public ZeroException(String msg) {
		this.msg = msg;
	}
	
	//method
	public String getMsg() {
		return msg;
	}
	
}


public class ExceptionExample {
	public static void main(String[] args) throws ZeroException {
		
		int j =20;
		int i =0;
		
		if (i == 0) {
			throw new ZeroException("0 is not Allowed ");
			
		}
		
		try {
			int res = j/i;
			System.out.println(res);
		}
		catch(ArithmeticException e) {
			System.out.println("handle ");
			System.out.println(e.getMessage());
		}
		System.out.println(i);
		
	}

}
