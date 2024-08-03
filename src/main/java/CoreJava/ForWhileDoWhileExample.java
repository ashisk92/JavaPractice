package CoreJava;

public class ForWhileDoWhileExample {

	public static void main(String[] args) {
		
		/*
		 * A loop will have 3 things which are,
		 	1.Intialization
		 	2.Condition
		 	3.Increment/Decrement
		 		 				 		 
		 */
		
		//for(initialization;condition;increment)
		for(int i = 0; i < 25 ; i++) {
			System.out.println("We can do software testing either in manual or automated way");
		}
		
		  /*
		  initialization
		  while(condition)
		  {
		  increment
		  }
		 */
		//While is entry controlled loop like a strict teacher who will not
		// allow a student unto the class without completing the assignment
		int i = 0;
		while (i<25) {
			System.out.println("We can do software testing either in manual or automated way");
			i++;
		}
		
		//Do While is Exit controlled loop like a lieient teacher, who will allow 
		// student into the clas for today, if not done tomorrow, he will not allow him
		int j = 0;
		do {
			System.out.println("We can do software testing either in manual or automated way");
			j++;
		}
		while(j<25);
		

	}

}
