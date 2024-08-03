package CollectionsInJava;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapPractice {

	public static void main(String[] args) {

		HashMap<Integer, String> fruits = new HashMap<Integer, String>();

		fruits.put(1, "Mango");
		fruits.put(2, "Orange");
		fruits.put(3, "Apple");
		fruits.put(4, "Berry");
		fruits.put(5, "Grape");

		System.out.println(fruits);

		Set<Entry<Integer, String>> set = fruits.entrySet();
		Iterator<Entry<Integer, String>> it = set.iterator();

		while (it.hasNext()) {
			Map.Entry<Integer, String> ab = (Map.Entry<Integer, String>) it.next();
			System.out.println(ab.getKey() + " " + ab.getValue());

		}

	}

}
