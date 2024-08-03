package MostAskProg;

import java.util.Scanner;

public class AddTwoNum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		int a;
		System.out.println("Enter First Number: ");
		Scanner obj1 = new Scanner(System.in);
		a = obj1.nextInt();
		
		int b,sum;
		System.out.println("Enter Second Number: ");
		Scanner obj2 = new Scanner(System.in);
		b = obj2.nextInt();
		
		sum = a+b;
		
		System.out.println("Addition " + sum);
		// Don't use System.out.println(a+b);
		//a=44, b=5 --> 445
	}

}
