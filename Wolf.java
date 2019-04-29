/**
 * Wolf class
 * @author Praneet Kumar Pandey
 *
 */
public class Wolf extends Canine{
	/**
	 * Constructor to initialize Wolf
	 * @param x
	 * @param y
	 */
	Wolf(int x,int y){
		super (x,y);
	}
	static final String name="Wolf";
	String getName() {
		return name;
	}
	static final char ID='w';
	char getID() {
		return ID;
	}
}
