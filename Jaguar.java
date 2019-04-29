
/**
 * Jaguar class
 * @author Dell
 *
 */
public class Jaguar extends Feline{
	/**
	 * Constructor to initialize Jaguar
	 * @param x
	 * @param y
	 */
	Jaguar(int x, int y){
		super(x,y);
	}
	static final String name="Jaguar";
	String getName() {
		return name;
	}
	static final char ID='j';
	char getID() {
		return ID;
	}
	public boolean attack(Animal b) {
		if(b.getID()==Turtle.ID) {
			return true;
		}
		else {
			return super.attack(b);
		}
	}
}
