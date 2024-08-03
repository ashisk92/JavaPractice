package MostAskProg;

public class PrintIndividualWord {

	public static void main(String[] args) {
		
		String str = "Java, Python, C, Ruby";
		str=str.replaceAll("\\s", "");
		
		String word[]=str.split(",");
		for(int i=0; i<word.length; i++) {
			System.out.println(word[i]);
		}

	}

}
