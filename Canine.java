import java.awt.*;
abstract class Canine extends Animal{
	private Point loc=super.getLoc();
	 final static String type="Canine";
	/**
	 * Constructor to initialize Canine Animal
	 * @param x
	 * @param y
	 */
	protected Canine(int x,int y) {
		super(x,y);
	}
	Point getLoc() {
		return this.loc;
	}
	
	
	public Point move() {
		
		int change = (int)(Math.random()*2);
		change+=1;
		int x0=0;
		int y0=0;
		if(Math.random()<0.5) {
			change*=-1;
		}
		if(Math.random()<0.5) {
			x0=change;
		}
		else {
			y0=change;
		}
		
		return (new Point(loc.x+x0, loc.y+y0));	
		
	}
	public boolean attack(Animal b) {
		if (b.getType().equals(Feline.type)) {
			return (Math.random()<0.5?true:false);
		}
		else {
			return super.attack(b);
		}
	}
}