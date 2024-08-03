package MostAskProg;

import java.util.Scanner;

public class PrintAllOddNum {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		int num, sum=0;
		System.out.println("Enter no. of Term ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		
		for(int i=1; i<=num; i=i+2)
		{
			sum=sum+i;
		}
		System.out.println(sum);
	}

}
