package HandlingExceptionsInJava;

public class ThrowKeyword {

	public static void main(String[] args) {

		System.out.println("ABC");
		
		try {
			throw new Exception("Naveen Exception");
		} catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("PQR");

	}

}
