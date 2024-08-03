package ExcelRSolutions;

public class Teachers extends SchoolBase {
	
	//Properties
	int teacherId;
	String name;
	int age;
	String[] subjects;
	
	
	//Behaviours
	
	@Override
	public void markAttendance() {
		System.out.println("Teacher marking 8Hr attendance");
	}
	
	public void conductLectures() {
		System.out.println("Conductiong Lectures");
	}
	
	public void giveAssignments() {
		System.out.println("Giving Assignments");
	}
	
	public void conductExams() {
		System.out.println("Teacher conducting Exams");
	}

}
