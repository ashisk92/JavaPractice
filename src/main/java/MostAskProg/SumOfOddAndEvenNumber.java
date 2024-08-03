package MostAskProg;

public class SumOfOddAndEvenNumber {

	public static void main(String[] args) {
		
		int[] a = {2,4,3,5,7,8,9};
		//evenSum = 2+4+8 =14
		//oddSum = 3+5+7 =15
		
		int len = a.length;
		int evenSum = 0, oddSum = 0;
		
		for(int i=0; i<len; i++) {
			if(a[i] % 2 == 0) {
				evenSum = evenSum+a[i];
			}
			else {
				oddSum = oddSum+a[i];
			}
		}
		
		System.out.println(evenSum);
		System.out.println(oddSum);

	}

}
