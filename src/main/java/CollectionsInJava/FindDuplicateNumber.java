package CollectionsInJava;

import java.util.ArrayList;

public class FindDuplicateNumber {

	public static void main(String[] args) {
		
		int nums[] = {2,4,63,3,2,4,5,6,7,8};
		
		ArrayList<Integer> ab = new ArrayList<Integer>();
		
		for(int i=0; i<nums.length; i++) {
			
			int k=0;
			
			if(!ab.contains(nums[i])) {
				ab.add(nums[i]);
				k++;
				
				for(int j=i+1; j<nums.length; j++) {
					if(nums[i] == nums[j]) {
						k++;
						
					}
				}
			if(k == 1 ) {
				System.out.println("Unique Number is: "+ nums[i]);
			}
			
			//System.out.println(nums[i] + "-"+ k);
			}
			

		}
		
	}

}
