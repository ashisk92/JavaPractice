package CollectionsInJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		//can accept DUPLICATE values
		//ArrayList can grow & shrink in size automatically when objects are added or removed
		ArrayList<String> str = new ArrayList<String>();
		str.add("java");
		str.add("selenium");
		str.add("python");
		System.out.println(str);
		
		//In ArrayList we can add by Index No
		str.add(0, "ruby");
		System.out.println(str);
		
		System.out.println(str.contains("selenium"));
		System.out.println(str.indexOf("python"));
		
		//To find LENGTH of an ArrayList
		System.out.println(str.size());
		
		//To print all the values from ArrayList
		//1.Using for loop
		//2.Using Iterator
		
		for(int i=0; i<str.size(); i++) {
			System.out.println(str.get(i));
		}
		
		System.out.println("Printing value using Iterator *************");
		//Using ITERATOR
		
		Iterator<String>it = str.iterator();
		//In iterator always use while loop
		while(it.hasNext()) {
			String ele = it.next();
			System.out.println(ele);
		}
		
		
		

	}

}
