package MostAskProg;

import java.util.Scanner;

public class SumOfFirstNnumber {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int num, sum = 0;
		System.out.println("Enter no. of Term ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			sum = sum+i;
		}
		System.out.println("ADDITION " + sum);
		
	}

}
