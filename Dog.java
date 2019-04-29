
/**
 * Dog class
 * @author Praneet Kumar Pandey
 *
 */
public class Dog extends Canine {
	/**
	 * Constructor to initialize Dog
	 * @param x
	 * @param y
	 */
	Dog(int x, int y){
		super(x,y);
	}
	static final String name="Dog";
	String getName() {
		return name;
	}
	static final char ID='d';
	char getID() {
		return ID;
	}
	
}
