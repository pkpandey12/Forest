
/**
 * Hippo class
 * @author Praneet Kumar Pandey
 *
 */
public class Hippo extends Animal{
	static final String name="Hippo";
	
	/**
	 * Constructor to initialize Hippo
	 * @param x
	 * @param y
	 */
	Hippo(int x,int y){
		super(x,y);
	}
	String getName() {
		return Hippo.name;
	}
	static final char ID='h';
	char getID() {
		return ID;
	}
}
