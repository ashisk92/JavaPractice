package CoreJava;

public class SwitchCase {

	public static void main(String[] args) {
		
		String myHero = "Ant Man";
		
		switch (myHero) {
		case "Iron Man":
			System.out.println("My favourite superhero is : "+myHero);
			break;
		case "SuperMan":
			System.out.println("My favourite superhero is : "+myHero);
			break;
		case "Captain America":
			System.out.println("My favourite superhero is : "+myHero);
			break;
			
		default:
			System.out.println("Sorry !! I do not know about him... "+ myHero);
			break;
		}

	}

}
