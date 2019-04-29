import java.util.*;
import java.awt.*;
/**
 * The Animal abstract class stores the blueprint for all the animals, specific animal classes are implemented dynamically
 * to create a modular environment
 * @author Praneet Kumar Pandey
 *
 */
public abstract class Animal implements Comparable<Animal> {
	private Point loc = new Point(0,0);
	private Point lastloc = new Point(0,0);
	 final static String type = "Animal";
	 final static String name= "Animal";
	//String moveMessage=name+" moved from ("+Integer.toString(loc[0])+", "+Integer.toString(loc[1])+") to ("+Integer.toString(newloc[0])+", "+Integer.toString(newloc[1])+")";
	/**
	 * Constructor for Animal class to store location
	 * @param row row 
	 * @param col column
	 */
	
	
	protected Animal(int row, int col) {
		loc.setLocation(row,col);
	
	}
	void setlastLoc(Point p) {
		lastloc.setLocation(p);;
		
	}
	Point getLastLoc() {
		return lastloc;
	}
	/**
	 * Setter for use within class
	 * @param x row
	 * @param y column
	 * @return integer array containing location of animal
	 */
//	int [] setLoc(int x, int y) {
//		int[]tloc=new int[2];
//		tloc[0]=x;
//		tloc[1]=y;
//		return tloc;
//		
//	}
	/** setter for use outside of class
	 * @param x row
	 * @param y column
	 */
	void setLoc(int x,int y) {
		setlastLoc(loc);
		loc.setLocation(x, y);
	}
	/**
	 * getter for location of animal
	 * @return integer array containing coordinates of animal in forest
	 */
	Point getLoc() {
		return loc;
	}
	/**
	 * getter for type of animal (mostly for use with intermediate subclasses)
	 * @return type of animal (Feline or Canine)
	 */
	String getType() {
		return Animal.type;
	}
	/**getter for animal name
	 * @return animal name in String
	 */
	String getName() {
		return Animal.name;
	}
	/**
	 * abstract function to be used later to get animal ID to place on forest
	 * @return animal ID
	 */
	abstract char getID();
	/**
	 * Controls movement of animals in the forest, works for all animals who don't identift as Feline or Canines
	 * @param forest
	 * @param id
	 * @return
	 */
	
	public Point move() {
		int dirFlag=(int)(Math.random()*4);
		switch(dirFlag) {
			case 0://North
				return (new Point(loc.x, loc.y-1 ));
				
			case 1://South
				return (new Point(loc.x, loc.y+1));
				
			case 2://East
				return (new Point(loc.x+1, loc.y));
			case 3://West
				return (new Point(loc.x-1, loc.y));
			default: 
				return null;
		}
		
	}	
	public boolean attack(Animal b) {
		if (b.getID()==(Turtle.ID)) {
			return (Math.random()<0.2?false:true);
		}
		else if (b.getID()==this.getID()) {
			return Math.random()<0.5?true:false;
		}
		else {
			return false;
		}
		
	}
	public void moveToDead() {
		this.setLoc(-1, -1);
	}
	public int compareTo (Animal a) {
		return ((a.getName()).compareTo(name));
	}
	/**
	 * Comparator to facilitate sorting of Animals
	 */
	public static Comparator<Animal> NameComparator = new Comparator<Animal>() {
        public int compare(Animal e1, Animal e2) {
            return e1.getName().compareTo(e2.getName());
        }
    };
	
}

