package MostAskProg;

public class ReverseString {

	public static void main(String[] args) {
		
		String s = "Selenium";
		
		//using for loop
		String rev = "";
		int len=s.length();
		
		for(int i=len-1; i>=0; i--) 
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		
		//Using StringBuffer class
		StringBuffer sf = new StringBuffer(s);  //StringBuffer is mutable
		System.out.println(sf.reverse());
		
		
		
		
	}

}
