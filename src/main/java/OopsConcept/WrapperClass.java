package OopsConcept;

public class WrapperClass {
	
	public static void main(String[] args) {
		
		//Wrapper Class is used for DATA CCONVERSION
		
		String x = "100";
		System.out.println(x+20);
		
		//data conversion : String to Int
		int i = Integer.parseInt(x);
		System.out.println(i);
		System.out.println(i+20);
		
		//data conversion : String to Double
		String y = "12.33";
		System.out.println(y+3);
		
		double j = Double.parseDouble(y);
		System.out.println(j);
		System.out.println(j+3);
		
		//data conversion : String to Boolean
		String k = "true";
		System.out.println(k);
		
		boolean p = Boolean.parseBoolean(k);
		System.out.println(p);
		
		//data conversion : Integer to String
		int q = 200;
		String h = String.valueOf(q);
		System.out.println(h);
		System.out.println(h+20);
		
		String u = "100A";
		try {
		int f = Integer.parseInt(u);	//It will give u NumberFormatExceptionError
		} catch(Exception e) {
			System.out.println("It will give u NumberFormatExceptionError");
		}
		
		
		
		
	}

}
