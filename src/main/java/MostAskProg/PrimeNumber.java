package MostAskProg;

public class PrimeNumber {

	public static boolean isPrimeNumber(int num) {
		// 2,3,5,7,11,13...
		if (num <= 1) {
			return false;
		}
		
		for(int i=2; i<num; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		
		return true;
	}
	
	public static void main(String[] args) {
		System.out.println("49 is prime number: " + isPrimeNumber(49));
		
	}

}
