/*Hospital Appointment

Problem Statement:
Create a Hospital class with a bookAppointment() method.

Maintain the number of available appointment slots.
If a slot is available, book the appointment.
If no slots are available, throw an exception "No Appointment Slots Available".
Handle the exception in main().*/


package Exception;
import java.util.*;

class HospitaAppointmentException1 extends Exception{
	
	String msg;
	public HospitaAppointmentException1() {
		this.msg =msg;
		
	}
	
	public String getMessage() {
	return msg;
	}
	
}

class Hospital  {
	int availableAppointmentSlots = 15;
	
	void bookAppointment() {
		if(availableAppointmentSlots >  )
	}
}

public class HospitaAppointmentException {
	
	public static void main(String[] args) {
		
	}

}
