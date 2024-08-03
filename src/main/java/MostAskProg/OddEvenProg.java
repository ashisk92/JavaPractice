package MostAskProg;

import java.util.Scanner;

public class OddEvenProg {

	@SuppressWarnings("resource")
	public static void main(String args[]) {
		
		int num;
		System.out.println("Enter a number: ");
		Scanner obj = new Scanner(System.in);
		num = obj.nextInt();
		
		if(num%2==0) 
		{
			System.out.println("Even Number");
		}
		else
		{
			System.out.println("Odd Number");
		}
	}

}
