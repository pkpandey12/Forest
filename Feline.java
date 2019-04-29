import java.awt.*;

abstract class Feline extends Animal{
	private Point loc=super.getLoc();
	final static char ID = 'f';
	final static String type="Feline";
	char getID() {
		return ID;
	}
	/**
	 * Constructor to initialize Feline animal
	 * @param x
	 * @param y
	 */
	protected Feline(int x, int y) {
		super(x,y);
	}
	Point getLoc() {
		return this.loc;
	}
	String getType() {
		return type;
	}
	public Point move() {
		int x0 = (int)(Math.random()*2) +1;
		int y0 = (int)(Math.random()*2) +1;
		if(Math.random()<0.5) {
			x0=(-1)*x0;
		}
		if(Math.random()<0.5) {
			y0=(-1)*y0;
		}
		return (new Point(loc.x+x0, loc.y+y0));	
	}
	public boolean attack(Animal b) {
		if(b.getType().equals(Canine.type)) {
			return true;
		}
		else {
			return super.attack(b);
		}
	}
}