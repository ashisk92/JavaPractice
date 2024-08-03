package MostAskProg;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {

		String s = "selenium";

		char[] letters = s.toCharArray();

		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		for (Character ch : letters) {
			if (charMap.containsKey(ch)) {
				charMap.put(ch, charMap.get(ch) + 1);
			} else {
				charMap.put(ch, 1);
			}
		}

		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		for (Map.Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + ":" + entry.getValue());	
			}
			System.out.println(entry.getKey() + ":" + entry.getValue());
		}
		//System.out.println(charMap);

	}

}
