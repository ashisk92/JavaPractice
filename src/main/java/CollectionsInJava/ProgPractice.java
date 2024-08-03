package CollectionsInJava;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ProgPractice {

	public static void main(String[] args) {

//Find duplicate charcter from String by using HashMap
		String s = "Selenium";
		// Convert string to charcter
		char[] charArray = s.toCharArray();

		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (Character ch : charArray) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		Set<Entry<Character, Integer>>	entrySet = map.entrySet();

		for(Entry<Character, Integer> entry : entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey() + " " + entry.getValue());
			}
		}
		
	}

}
