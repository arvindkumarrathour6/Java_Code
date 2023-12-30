package Hospital;

import java.util.*;

public class Hospital_imp implements HospitalInterface
{
	int Id;
    List<Patient> host = new ArrayList<>();
    List<Doctor> doctor= new ArrayList<>();
    List<Appointment> appoint = new ArrayList<>();
    
    Scanner sc = new Scanner(System.in);
    public Hospital_imp() {
    	doctor.add(new Doctor( 1, " Arvind Kumar"  ,"Cardiologist "));
		doctor.add(new Doctor( 2,"  Sujal Gupta","  Dermetologist "));
		doctor.add(new Doctor( 3,"  Sumit gupta","           Diebetologist"));
		doctor.add(new Doctor( 4,"   Raushan kumar  ","            Gynecologist"));
		doctor.add(new Doctor( 5,         " Rohit"  ,"            Neurologist "));
		doctor.add(new Doctor(6,         " Kunal"         ,          " Dietition "));
		doctor.add(new Doctor( 7,          " Prakash" ,      " Physiotherapist" ));
    }
	@Override
	public void registration() {
		double amount=0;
		String dname=null;
		System.out.println("Enter Patient Id:");
		int id = sc.nextInt();
		System.out.println("Enter Patient Name:");
		String name =sc.next();
		System.out.println("Enter patient Contact");
		Long contact = sc.nextLong();
		System.out.println("Enter the Patient's Medical Condition");
		String medical=null;
		System.out.println("1. Heart Pain\n2. Skin,hair or nail Disorders\n3. Diabetes\n4. Women's Health Issues");
		System.out.println("5. Neuro Diorders\n6. Health issues Regarding to food\n7. Any physical body pain");
		System.out.println("Enter your Choice:");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			medical="Heart Pain";
			dname="Arvind Kumar";
			amount=5000;
			break;
		
		case 2:	
			medical="Skin,hair or nail Disorders";
			dname="Sujal Gupta";
			amount=2000;
			break;
		case 3:
			medical="Diabetes";
			dname="Sumit Gupta";
			amount=2500;
			break;
		case 4:
			medical="Women's Health Issues";
			dname="Raushan";
			amount=3000;
			break;
		case 5:
			medical="Neuro Diorders";
			dname="Rohit";
			amount=4000;
			break;
		case 6:
			medical="Health issues Regarding to food";
			dname="Kunal";
			amount=5000;
			break;
		case 7:
			medical="Any physical body pain";
			dname="Prakash";
			amount=3000;
			break;
		default:
			System.err.println("You Enter Wrong Choice ! Try Again....");
		}
		try{
			if(Id==id) {
				throw new PatientIdPresent();
			}
			else {
				host.add(new Patient(id,name,contact,medical,amount,dname));
				System.out.println("Patient Registration Done Successfylly... ");
			}
		}
		catch(PatientIdPresent e) {
			System.err.println(e.getMessage());
		}
		 Id=id;
		}

	@Override
	public void scheduleappointment() {
		
		
		System.out.println("Enter Appointment Id:");
		int aid=sc.nextInt();
		String date = null,time=null,time1=null,dname = null,pname=null;
		double amount = 0;
		System.out.println("Enter the Patient Id:");
		int pid=sc.nextInt();
		boolean b= false;
		try{
			for(Patient h1:host) {
				if(h1.getId()==pid) {
				b=true;
				amount=h1.getAmount();
				System.out.println("Enter appointment Date:");
				date=sc.next();
				System.out.println("Enter appointment Time:");
				time=sc.next();
				pname=h1.getName();
				dname=h1.getDname();
				System.out.println("please select your choice:\n1.AM\n2.PM");
				int n=sc.nextInt();
				switch(n) {
				case 1:
					time+="AM";
					break;
				case 2:
					time+="PM";
					break;
				}
			}
			}
		
				if(!b){
					throw new PatientNotFound();
				}
		}
			catch(PatientNotFound e) {
				System.err.println(e.getMessage());
			}
		appoint.add(new Appointment(aid,date,time,amount,pname,dname));
		
		}
		
		
	

	@Override
	public void display_patient() {
		System.out.println("ID          Name                Contact                   MedicalHistory  ");
		for(Patient h1:host) {
		System.out.println(h1.getId()+"            "+h1.getName()+"            "+h1.getContact()+"            "+h1.getMedical());	
		}
		
	}

	@Override
	public void display_doctor() {
		System.out.println("___________________________________________________ ");
		System.out.println(" Did           |           DoctorName            |           Specialization ");
		System.out.println(" ___________________________________________________ ");
		for(Doctor d:doctor)
		System.out.println( d.getDid()+"              |          "+d.getDname()+"         |            "+d.getSpecialization());
		
		System.out.println(" ___________________________________________________");
		
	}

	@Override
	public void display_appointment() {
		
		System.out.println("ID          PatientName         DoctorName                                 Date                            Time");
		for( Appointment p:appoint) {
			if(p!=null) {
			System.out.println(p.getAid()+"            "+p.getPname()+"                             "+p.getDname()+"                            "+p.getDate()+"                 "+p.getTime());	
		}
		}
	}

	@Override
	public void bill() {
		System.out.println("Enter The Appointment ID:");
		int aid=sc.nextInt();
		boolean b=false;
		
		try{
			for(Appointment p:appoint) {
			if(p.getAid()==aid) {
				b=true;
				System.out.println("Bill Generated Successfully");
				System.out.println("========================\n");
				System.out.println("Service Charge is:-                 "+p.getAmount()+"\n");
				System.out.println("Doctor charge is:-                    500\n");
				System.out.println("Total Amount is:-                   "+p.getAmount()+500+"\n");
				System.out.println("GST:- 18%:-                            "+(p.getAmount()+500)*0.18+"\n");
				double a=p.getAmount()+(p.getAmount()+500)*0.18;
				System.out.println("Total Amount To Be Piad Is:-"+a);
				System.out.println("=========================\n");
				System.out.println("=======Thank You=========");
				
			}
		}
			if(!b) {
				throw new AppointmentNotFound();
			}
		}
		catch(AppointmentNotFound e) {
			System.err.println(e.getMessage());
		}
	

}
}
