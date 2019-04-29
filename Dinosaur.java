
import java.awt.*;
/**
 * Dinosaur class
 * @author Praneet Kumar Pandey
 *
 */
public class Dinosaur extends Animal{
	/**
	 * Constructor to initialize Dinosaur
	 * @param x
	 * @param y
	 */
	Dinosaur(int x, int y){
		super(x,y);
	}
	private Point loc = super.getLoc();
	static final String name="Dinosaur";
	String getName() {
		return name;
	}
	static final char ID='i';
	char getID() {
		return ID;
	}
	public boolean attack(Animal b) {
		if(b.getID()==Dinosaur.ID) {
			return Math.random()<0.5? true:false;
		}
		return true;	
		}
	public Point move() {
		 int dirFlag;
		dirFlag = (int) (Math.random() *4);		
		switch(dirFlag) {
			case 0:
				
				return new Point(loc.x-3,loc.y);
			case 1:
				
				return new Point(loc.x+3,loc.y);
			case 2:
			
				return new Point(loc.x, loc.y-3);
			case 3:
				
				return new Point(loc.x, loc.y+3);
			default:
					return null;
			}
		}
		
	
}
