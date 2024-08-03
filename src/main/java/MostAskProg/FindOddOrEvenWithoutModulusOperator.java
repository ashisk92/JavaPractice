package MostAskProg;

public class FindOddOrEvenWithoutModulusOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 101;
		if (isEven(n) != false)
			System.out.print("Even");
		else
			System.out.print("Odd");
	}

	public static boolean isEven(int n) {

		// Return true if
		// n/2 does not result
		// in a float value.
		return ((n / 2) * 2 == n);
	}

}
