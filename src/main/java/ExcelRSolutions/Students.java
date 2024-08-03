package ExcelRSolutions;

public class Students extends SchoolBase {
	
	//Properties
	int studentId;
	String name;
	int rollNo;
	String address;
	int age;
	int standard;
	char division;
	String schoolName;
	
	//Behaviour
	public void study() {
		System.out.println("Students are studying");	
	}
	
	public void attendClass() {
		System.out.println("Students are attending class");
	}
	
	public void doExercise() {
		System.out.println("Students are exercising");
	}
	
	
	@Override
	public void markAttendance() {
		System.out.println("Teacher marking attendance");
	}
	
	
	
	
	
	
	
	
	

}
