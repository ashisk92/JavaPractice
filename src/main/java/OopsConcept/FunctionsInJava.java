package OopsConcept;

public class FunctionsInJava {
	
	
	public static void main(String[] args) {
		
		FunctionsInJava obj = new FunctionsInJava();
		
		obj.test();
		
		int l=obj.pqr();
		System.out.println(l);
		
		String txt=obj.qa();
		System.out.println(txt);
		
		int div=obj.division(20, 10);
		System.out.println(div);
		
		
	}
	
	
	//no input, no output
	public void test() {
		System.out.println("Test Method");
	}
	
	//no input, some output
	public int pqr() {
		System.out.println("PQR Method");
		int a=10;
		int b=20;
		int c=a+b;
		
		return c;	
	}
	
	//no input, some output
	public String qa() {
		System.out.println("QA Method");
		String s="Selenium";
		
		return s;
	}
	
	//input, output
	public int division(int x, int y) {
		System.out.println("Division Method");
		int d=x/y;
		
		return d;
	}
	
	
	
	
	
	
}
