package CoreJava;

public class StaticExample {

	private static String msg = "GeeksForGeeks";

	// Static nested class
	public static class NestedStaticClass {

		// Only static members of Outer class
		// is directly accessible in nested
		// static class
		public void printMessage() {

			// Try making 'message' a non-static
			// variable, there will be compiler error
			System.out.println("Message from nested static class: " + msg);
		}
	}

	// Non-static nested class -
	// also called Inner class
	public class InnerClass {

		// Both static and non-static members
		// of Outer class are accessible in
		// this Inner class
		public void display() {

			// Print statement whenever this method is
			// called
			System.out.println("Message from non-static nested class: " + msg);
		}
	}

	public static void main(String[] args) {
		
		System.out.println(msg);
		
		
		StaticExample.NestedStaticClass printer = new StaticExample.NestedStaticClass();
		printer.printMessage();
		
		StaticExample print = new StaticExample();
		StaticExample.InnerClass innerObj = print. new InnerClass();
		innerObj.display();
		

	}

}
