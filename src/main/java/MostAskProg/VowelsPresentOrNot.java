package MostAskProg;

public class VowelsPresentOrNot {

	public static void main(String[] args) {

		String str = "Welcome";
		for(int i=0; i<str.length();i++) {
			if(isVowel(str.charAt(i))) {
				System.out.println(str.charAt(i));
			}
		}

	}

	public static boolean isVowel(char t) {
		return t == 'a' || t == 'e' || t == 'i' || t == 'o' || t == 'u' || t == 'A' || t == 'E' || t == 'I' || t == 'O'
				|| t == 'U';
	}

}
