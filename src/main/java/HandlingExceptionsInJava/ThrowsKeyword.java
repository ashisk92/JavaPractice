package HandlingExceptionsInJava;

public class ThrowsKeyword {

	public static void main(String[] args) {
		
		ThrowsKeyword obj = new ThrowsKeyword();
		obj.sum();
		System.out.println("ABC");	

	}
	
	
	
	public void sum() {
		try {
			div();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	//Used to implicitly throw an exception 
	
	public void div() throws ArithmeticException {
		int i = 9/0;
	}

}
