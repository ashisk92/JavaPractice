package MostAskProg;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateElementsInArray {

	public static void getArray(int arr[]) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

	public static void main(String[] args) {

		String names[] = { "Java", "Python", "Ruby", "C", "C", "Java" };

		int age[] = { 2, 4, 12, 3, 12, 4 };

		// 1.Compare each element: Worst Solution
		for (int i = 0; i < age.length; i++) {
			for (int j = i + 1; j < age.length; j++) {
				if (age[j] == age[i]) {
					System.out.println(age[j]);
				}
			}
		}

		System.out.println("***********************************");
		// 2.Using HashSet

		Set<Integer> ageSet = new HashSet<Integer>();
		for (int i = 0; i < age.length; i++) {
			ageSet.add(age[i]);
		}
		System.out.println(ageSet);
		Iterator<Integer> i = ageSet.iterator();
		while (i.hasNext()) {
			int num = i.next();
			System.out.println(num);
		}

		/*
		 * for (int i = 0; i < names.length; i++) { for (int j = i + 1; j <
		 * names.length; j++) { if (names[i].equals(names[j])) {
		 * System.out.println(names[i]); } } }
		 */

		System.out.println("***********************************");

		// 3.Using HashMap

		Map<Integer, Integer> listNum = new HashMap<Integer, Integer>();
		for (int c : age) {
			if (listNum.containsKey(c)) {
				listNum.put(c, listNum.get(c) + 1);
			} else {
				listNum.put(c, 1);
			}
		}
		System.out.println(listNum);

	}

}
