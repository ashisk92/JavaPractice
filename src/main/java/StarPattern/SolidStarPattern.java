package StarPattern;

public class SolidStarPattern {

	public static void main(String[] args) {
		
		int n=5;
		int m=6;
		
		// 	*****
		//	*****
		//	*****
		//	*****
			
		/*
		 	for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		//	*****
		//	*   *
		//	*   *
		//	*****
		
		/*
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=m; j++) {
				if(i==1 || j==1 || i==n || j==m) {
					System.out.print("*");
				}
				else
					System.out.print(" ");
			}
			System.out.println();
		}
		*/
		
		//	*
		//	**
		//	***
		//	****
		
		/*
		for (int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		//	****
		//	***
		//	**
		//	*
		
		/*
		for (int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		*/
		
		//	   *
		//	  **
		//	 ***
		//	****
		
		/*
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		*/
		
		//	1
		//	1 2
		//	1 2 3
		//	1 2 3 4
		
		/*
		for(int i=1; i<=n ;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
		System.out.println();
		}
		*/
		
		//	1 2 3 4
		//	1 2 3
		//	1 2
		//	1
		
		/*
		for(int i=n; i>=1; i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
		System.out.println();
		}
		*/
		
		//	    *****
		//	   *****
		//	  *****
		//	 *****
		//	*****
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			for(int j=1; j<=m; j++) {
				System.out.print("*");
			}
		System.out.println();
		}
		
		
		
		
		
		
		

	}

}
