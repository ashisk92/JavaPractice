package ExcelRSolutions;

public class Practice {

	public static void main(String[] args) {
		String s = "Selenium";
		int len = s.length();
		String rev = "";
		char ch ;
		for(int i=len-1; i>=0 ; i--) {
			ch = s.charAt(i);
			rev = rev + ch;
			
		}
		System.out.println(rev);
		
		StringBuffer str = new StringBuffer(s);
		System.out.println(str.reverse());
		
	}	

}
