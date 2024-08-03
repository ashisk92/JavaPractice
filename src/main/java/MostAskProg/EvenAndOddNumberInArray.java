package MostAskProg;

public class EvenAndOddNumberInArray {

	public static void main(String[] args) {
		
		int num[]= {2,78,5,98,146,3};
		
		//Extracting even numbers..........
		int countSum = 0;
		for(int i=0; i<num.length; i++) {
			if(num[i]%2==0) {
				countSum++;
				System.out.println(num[i]);		
			}
		}
		System.out.println(countSum);
		//By Using Enhanced For Loops
		/*for(int value:num) {
			if(value%2==0) {
				System.out.println(value);
			}
		}*/
		
		//Extracting Odd Numbers......
		for(int i=0; i<num.length; i++) {
			if(num[i]%2!=0) {
				System.out.println(num[i]);
			}
		}
		
	}

}
