package MostAskProg;

import java.util.Scanner;

public class OddEvenSum {

	
	public static void main(String[] args) {
		
		int num, sumEven=0, sumOdd=0;
		System.out.println("Enter no. of Term ");
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		
		//Even number=0,2,4,6,8,10,12
		//Odd Number=1,3,5,7,9,11
		
		for(int i=0; i<=num; i=i+2)
			{
				sumEven=sumEven+i;
			}
		System.out.println("Sum of Even Number "+ sumEven);
		
		for(int i=1; i<=num; i=i+2)
		{
			sumOdd=sumOdd+i;
		}
		System.out.println("Sum of Odd Number "+ sumOdd);
		

	}

}
