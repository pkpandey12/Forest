import java.awt.*;
public class Printer{
	public static void print(String s) {
		System.out.println(s);
	}
	public static void printChoices() {
		System.out.println("1. Dog (d)");
		System.out.println("2. Fox (f)");
		System.out.println("3. Wolf (w)");
		System.out.println("4. Jaguar (j)");
		System.out.println("5. Lion (l)");
		System.out.println("6. Cat (c)");
		System.out.println("7. Kitten (k)");
		System.out.println("8. Dinosaur (i)");
		System.out.println("9. Turtle (u)");
		System.out.println("Which would you like to add to the Forest?");
		System.out.println("\nPlease enter your choice (1-8, or 0 to finish the animal input)");
	}
	public static void printMoveMessage(Animal a, Point p, Point oldloc) {
		System.out.println(a.getName()+" moved from ("+oldloc.x+", "+oldloc.y+") to ("+p.x+", "+p.y+") ");
	}
	public static void printAttackMessage(Animal a, Animal b, Point p, Point oldloc, boolean win) {
		String winloss= win?"wins":"loses";
		System.out.println(a.getName()+" from ("+oldloc.x+", "+oldloc.y+") attacks "+b.getName()+" at ("+p.x+", "+p.y+") and "+winloss);
	}
	public static void printStayMessage(Animal a, Point p) {
		System.out.println(a.getName() +" stayed in ("+p.x+", "+p.y+")");
	}
	public static void printAddMessage(int c, Point p) {
		int row = p.x;
		int col = p.y;
		switch(c) {
		case 1:
			System.out.println("Added Dog at ("+row+","+col+"): Dog is Canine, Canine moves in four directions, one or two steps at a time.");			
			break;
		case 2:
			
			System.out.println("Added Fox at ("+row+","+col+"): Fox is Canine, Canine moves in four directions, one or two steps at a time.");
			break;
		case 3:
			
			System.out.println("Added Wolf at ("+row+","+col+"): Wolf is Canine, Canine moves in four directions, one or two steps at a time.");
			break;
		case 4:
			
			
			System.out.println("Added Jaguar at ("+row+","+col+"): Jaguar is Feline, Feline moves in all eight directions, one step a time.");
			break;
		case 5:
			
			System.out.println("Added Lion at ("+row+","+col+"): Lion is Feline, Feline moves in all eight directions, one step a time.");		
			break;
		case 6:
			
			System.out.println("Added Cat at ("+row+","+col+"): Cat is Feline, Feline moves in all eight directions, one step a time.");
			break;
		case 7:
			
			System.out.println("Added Kitten at ("+row+","+col+"): Kitten is Cat, Kitten has 30% chance stay in the same position, and 70% chance move in eight directions, one step at a time.");
			break;
		case 8:
			
			System.out.println("Added Dinosaur at ("+row+","+col+"): Dinosaur moves in four directions, three steps a time.");
			break;
		case 9:
			
			System.out.println("Added Turtle at ("+row+","+col+"): Turtle is Animal, Turtle has 50% chance stay in the same position, and 50% chance move in four directions, one step at a time.");
			break;
		default:
			System.out.println("WRONG INPUT. Choose a number between 1-8");
		}
			
	}
}

