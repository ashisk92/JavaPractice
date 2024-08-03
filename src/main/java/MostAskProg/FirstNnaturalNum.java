package MostAskProg;

import java.util.Scanner;

public class FirstNnaturalNum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int num;
		System.out.println("Enter no. of Term ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			System.out.println(i);
		}

	}

}
