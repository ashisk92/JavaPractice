package OopsConcept;

public class LocalVsGlobalVariable {
	
	
		//Global Variable-------Class Variable
		//Define immediate after the class
		String name = "Tom";
		int age = 25;

		
	public static void main(String[] args) {
		
		int i = 10;	// local var for main method only
		System.out.println(i);
		
		LocalVsGlobalVariable obj = new LocalVsGlobalVariable();
		System.out.println(obj.name);
		
		

	}
	
	public void sum() {
		int i = 10;		//local var for sum method
		int j = 20;		//local var for sum method
		
	}

}
