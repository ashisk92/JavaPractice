package OopsConcept;

public class MethodOverloading {

	
	/*When the method name is same with different arguments input parameters
	 * with different data types within the same class is known as Method Overloading
	 * 
	 */
	
	public static void main(String[] args) {
		
		MethodOverloading obj = new MethodOverloading();
		obj.sum();
		obj.sum(10);
		obj.sum(20, 10);


	}
	
	public void sum() {		//0 input parameter
		System.out.println("SUM method----zero parameter");
	}
	
	public void sum(int i) {	//1 input parameter
		System.out.println("SUM method----one parameter");
		System.out.println(i);
	}
	
	public void sum(int j, int l) {		//2 input parameter
		System.out.println("SUM method----two parameter");
		System.out.println(j+l);
	}

}
