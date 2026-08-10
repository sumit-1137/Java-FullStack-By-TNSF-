

package Exception;
import java.util.*;

class VoterIdException extends Exception{
	String msg;
	
	public VoterIdException(String msg) {
		this.msg =msg;
	}
	
	public String getMessage() {
		return msg;
	}
}

class VoterId{
	void apply(int age ) throws VoterIdException {
		if (age >21) {
			System.out.println("Apply for Voter Id ");
			
		}else  throw new VoterIdException("Not Eligible for Voter Id");
		
	}
	
}
public class VoterId_exception {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your Age : ");
		int age = sc.nextInt();
		
		VoterId voter = new VoterId();
		
		try {
			voter.apply(age);
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		}
		
	}
	
	

}
