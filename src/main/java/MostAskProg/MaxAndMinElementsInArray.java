package MostAskProg;

public class MaxAndMinElementsInArray {

	public static void main(String[] args) {
		
		int num[]= {5,454,-3,89,789};
		
		//Finding Maximum value
		int max=num[0];
		for(int i=1; i<num.length; i++) {
			if(num[i]>max) {
				max=num[i];
			}
		}
		System.out.println(max);
		
		//Finding Minimum value
		int min = num[0];
		for(int i=1; i<num.length; i++) {
			if(num[i]<min) {
				min=num[i];
			}
		}
		System.out.println(min);
	}

}
