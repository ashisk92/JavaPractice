package MostAskProg;

public class FibonacciSeries {
	static int secondPrevNum = 0;
	static int prevNum = 1;
	static int num = 0;

	public static void main(String[] args) {
		// 0 1 1 2 3 5 7 12 19 31
		printFib(10);
		

	}

	public static void printFib(int value) {
		if (value > 0) {
			num = secondPrevNum + prevNum;
			secondPrevNum = prevNum;
			prevNum = num;
			System.out.print(num + " ");
			printFib(value-1);
		}
	}

}
