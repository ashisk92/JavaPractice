package MostAskProg;

public class LargestWord {

	public static void main(String[] args) {


		String s = "india is my favourite country";

		
		
		String[] array = s.split(" ");
        String longestWord = " ";

        for (int i = 0; i < array.length; i ++) {
            if (array[i].length() >= longestWord.length()) {
                longestWord = array[i];
             //   System.out.println(longestWord);
            }
        }
		
        System.out.println(longestWord);
		

	}

}
