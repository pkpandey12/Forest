import java.awt.*;
/**
 * Kitten class
 * @author Praneet Kumar Pandey
 *
 */
public class Kitten extends Cat{
	/**
	 * Constructor for Kitten
	 * @param x
	 * @param y
	 */
	Kitten(int x, int y){
		super (x,y);
	}
	private Point loc=super.getLoc();
	private String name="Kitten";
	String getName() {
		return this.name;
	}
	static final char ID='k';
	char getID() {
		return ID	;
	}
	Point getLoc() {
		return this.loc;
	}
	public Point move() {
		if(Math.random()<0.3) {
			return null;
			
		}
		else
			return super.move();
	}
	public boolean attack(Animal b) {
		if (b.getID()==Kitten.ID) {
			return Math.random()<0.5?true:false;
			
		}
		else if(b.getID()==Cat.ID) {
			return Math.random()<0.7?false:true;
			
		}
		else
			return false;
	}
}
