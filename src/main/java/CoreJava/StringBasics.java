package CoreJava;

public class StringBasics {

	public static void main(String[] args) {
		
		
		// In string, always use .equals()
		
		//Lateral String
		String name = "Ashis";
		System.out.println(name);
		name = name.concat("Selenium");
		System.out.println(name);
		
		String s1 = "Java";
		String s2 = "Java";
		System.out.println(s1 == s2);		//true
		System.out.println(s1.equals(s2));	//true
		
		//By using new Keyword
		String s3 = new String("Selenium");
		s3 = s3.concat("Java");
		System.out.println(s3);
		
		String s4 = new String("Python");
		String s5 = new String("Python");
		
		System.out.println(s4==s5);			//false
		System.out.println(s4.equals(s5));	//true
		
		int arr[] = new int[5];
		System.out.println(arr);
		
		
		
	}

}
