package CoreJava;

public class ArrayTwoDimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] students=new String[4][5];
		
		students[0][0]="Ashis";
		students[0][1]="Sudhir";
		students[0][2]="Sameer";
		students[0][3]="Rahul";
		students[0][4]="Naina";
		
		students[1][0]="Rakul";
		students[1][1]="Salman";
		students[1][2]="Hello";
		students[1][3]="Selenium";
		students[1][4]="Java";
		
		students[2][0]="Python";
		students[2][1]="Ruby";
		students[2][2]="Sar";
		students[2][3]="Pradosh";
		students[2][4]="Debi";
		
		students[3][0]="Nidhi";
		students[3][1]="Renu";
		students[3][2]="Mukul";
		students[3][3]="Anu";
		students[3][4]="Muni";
		
		
		for(int row=0; row<students.length; row++) {
			for(int col=0; col<students[0].length; col++) {
				System.out.print(students[row][col]+" ");
			}
			System.out.println();
		}
		

	}

}
