package OopsConcept;

public class ConstructorConcept {
	
	String name;
	int age;
	
	public ConstructorConcept(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public ConstructorConcept() {
		System.out.println("Default Constructor");
	}
	
	public ConstructorConcept(int i) {
		System.out.println("One Parameter Constructor");
		System.out.println(i);
	}
	
	public ConstructorConcept(int i, int j) {
		System.out.println("Two Parameter Constructor");
		System.out.println(i + " " + j);
	}
	
	
	public static void main(String[] args) {
		
		ConstructorConcept obj = new ConstructorConcept();
		ConstructorConcept obj1 = new ConstructorConcept(10);
		ConstructorConcept obj2 = new ConstructorConcept(10,20);
		ConstructorConcept obj3 = new ConstructorConcept("Tom", 26);
		System.out.println(obj3.name);
		System.out.println(obj3.age);
		
		
	}

}
