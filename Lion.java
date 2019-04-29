/**
 * Lion class
 * @author Dell
 *
 */
public class Lion extends Feline{
	/**
	 * Constructor to initialize Lion
	 * @param x
	 * @param y
	 */
	Lion(int x, int y){
		super(x,y);
	}
	static final String name="Lion";
	String getName() {
		return Lion.name;
	}
	static final char id='l';
	char getID() {
		return Lion.id;
	}
	public boolean attack(Animal b) {
		if(b.getID()==Hippo.ID) {
			return true;
		
		}
		else {
			return super.attack(b);
		}
	}
}
