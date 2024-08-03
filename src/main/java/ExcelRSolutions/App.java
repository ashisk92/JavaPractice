package ExcelRSolutions;

public class App {
	
	//Creating an Object
	//<class_name> <ref_var_name> = new constructor();
	
	public static void main(String[] args) {
		
		Students s1 = new Students();
		Teachers t = new Teachers();
		
		//we can call by variable
		s1.name = "Ashsis";
		s1.studentId = 4;
		s1.age = 22;
		s1.schoolName = "ExcelR";
		
		System.out.println(s1.name);
		System.out.println(s1.studentId);
		System.out.println(s1.age);
		System.out.println(s1.schoolName);
		System.out.println(s1.rollNo);		//Result will be 0, Bcz we have not assign any value
		
		//we can call by Method Name
		s1.study();
		s1.attendClass();
		
		//Inheritance
		s1.markAttendance();
		t.markAttendance();
		
		//Creating SchoolBase class
		SchoolBase sb = new SchoolBase();
		sb.markAttendance();
		//sb.attendClass(); <-- we can't call child class
		
		
		
		
	}
	

}
