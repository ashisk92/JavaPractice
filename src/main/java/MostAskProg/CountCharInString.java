package MostAskProg;

public class CountCharInString {

	public static void main(String[] args) {

		String s = "Selenium Java ";
		int count = 0;
		for (int i = 0; i < s.length(); i++) {
			// remove space
			System.out.println(s.charAt(i));
				count++;
			
		}
		System.out.println(count);
	}

}
