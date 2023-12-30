package Hospital;

import java.util.Scanner;

public class Hospital
{
   public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	HospitalFactory hf=new HospitalFactory();
	HospitalInterface hi= hf.createinstace();
	System.out.println("===============Welcome To Hospital================");
	while(true) {
		System.out.println();
    	System.out.println("1.Registration Patient\n2.Schedule Appointment\n3.Display Patient List\n4.Display Doctors List");
		System.out.println("5.Display Scheduled Appointment List\n6.Generate Bill\n7.Exit\n");
		System.out.println("Enter your Choice:");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
		    hi.registration();
			break;
		case 2:	
			hi.scheduleappointment();
			break;
		case 3:
			hi.display_patient();
			break;
		case 4:
			hi.display_doctor();
			break;
		case 5:
			hi.display_appointment();
			break;
		case 6:
			hi.bill();
			break;
		case 7:
			System.exit(0);
			break;
		default:
			System.err.println("You Enter Wrong Choice ! Try Again....");	
		}
    }
}
}
