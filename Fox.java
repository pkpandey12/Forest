
/**
 * Fox class
 * @author Praneet Kumar Pandey
 *
 */
public class Fox extends Canine{
	/**
	 * Constructor to initialize Fox
	 * @param x
	 * @param y
	 */
	Fox(int x, int y){
		super(x,y);
	}
	static final String name="Fox";
	String getName() {
		return name;
	}
	static final char ID='f';
	char getID() {
		return ID;
	}
	public boolean attack(Animal b) {
		if (b.getID()==Cat.ID) {
			return true;
		}
		else {
			return super.attack(b);
		}
			
	}
}
