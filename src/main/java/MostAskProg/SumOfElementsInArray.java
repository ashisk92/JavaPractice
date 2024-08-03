package MostAskProg;

public class SumOfElementsInArray {

	public static void main(String[] args) {

		int nums[]= {3,56,456,6};
		int len=nums.length;
		int sum=0;
		
		for(int i=0; i<=len-1; i++) {
			sum=sum+nums[i];
		}
		
		System.out.println(sum);
		
		//By using Enhanced FOR Loop
		/*for(int value:nums) {
			sum=sum+value;
		}
		System.out.println(sum);*/
	}
}
	

