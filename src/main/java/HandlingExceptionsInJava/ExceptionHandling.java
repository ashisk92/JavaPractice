package HandlingExceptionsInJava;

public class ExceptionHandling {
	
	
	public static void main(String[] args) {
		
		
			
		//unchecked exception
		//try-catch block
		
		try {
		int a = 9/0;   //this code will throw an exception
		}catch (ArithmeticException e) {
			//e.printStackTrace();  <-- it will give u error message but not terminate the program
			System.out.println(e.getMessage());
		}catch (Exception ex) {
			//e.printStackTrace();  <-- it will give u error message but not terminate the program
			System.out.println(ex.getMessage());
		}
		
		
		System.out.println("ABC");
		
		
		//Thread.sleep(2000);  <--Checked Exception
		
		
	}


	
	
	
	

}
