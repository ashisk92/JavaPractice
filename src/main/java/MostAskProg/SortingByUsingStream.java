package MostAskProg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortingByUsingStream {
	public static void main(String[] args) {
		int arr[] = {3,2,6,4,8,7,9};
		
		//convert array to arraylist
		List numbers = Arrays.asList(arr);
		
		List<Integer> sortedNumbers =(List<Integer>) numbers.stream().sorted().collect(Collectors.toList());
		
		sortedNumbers.forEach(System.out::println);
	}
	
}
