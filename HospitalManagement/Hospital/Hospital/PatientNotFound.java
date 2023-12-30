package Hospital;

public class PatientNotFound  extends Exception{
	 
	public String getMessage() {
		return "Patient Not Found ,Kindly Register before scheduling Appointment";
	}

}
class AppointmentNotFound extends Exception{
	public String getMessage() {
		return "Appointment Id Not Found ,Kindly Scheduling Appointment";
	}
}
class PatientIdPresent extends Exception{
	public String getMessage() {
		return "Patient Id Already Registered,ple Enter New Id";
	}
}
