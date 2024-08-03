package JavaSelenium;

public class WhatWillBeTheOutput {
	
	int a;
	double b;
	String c;
	
	public void mkt(int a, double b, String c) {
		System.out.println("I am rockstar");
	}

	public static void main(String[] args) {
		
		WhatWillBeTheOutput ww = new WhatWillBeTheOutput();
		ww.mkt(1, 1.11, "mkt");
		System.out.println(ww.a);
		System.out.println(ww.b);
		System.out.println(ww.c);

	}

}
