package CoreJava;

public class StaticVariables {

	// example to show how a static variable perform

	static int account_bal = 0;
	String depositedBy;

	public static void main(String[] args) {

		StaticVariables sv1 = new StaticVariables();
		account_bal = 1000;
		sv1.depositedBy = "Supraja";

		StaticVariables sv2 = new StaticVariables();
		account_bal = 2000;
		sv2.depositedBy = "Muthu";
		
		System.out.println("account balance " + account_bal);
		System.out.println("deposited by " + sv1.depositedBy);
		System.out.println("deposited by " + sv2.depositedBy);
		System.out.println("account balance " + account_bal);

	}

}
