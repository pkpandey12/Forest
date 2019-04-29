
/**
 * Tiger class
 * @author Praneet Kumar Pandey
 *
 */
public class Tiger extends Feline{
	/**
	 * Constructor to initialize Tiger
	 * @param x
	 * @param y
	 */
	Tiger(int x, int y){
		super(x,y);
	}
	private String name="Tiger";
	String getName() {
		return this.name;
	}
	private char id='t';
	char getID() {
		return id;
	}
}
