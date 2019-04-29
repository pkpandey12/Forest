/**
 * Turtle class
 * @author Praneet Kumar Pandey
 *
 */
import java.awt.*;
public class Turtle extends Animal{
	/**
	 * Constructor to initialize Turtle
	 * @param x
	 * @param y
	 */
	Turtle(int x, int y){
		super(x,y);
	}
	public static final char ID='u';
	private Point loc=super.getLoc();
	
	static final String name="Turtle";
	String getName() {
		return name;
	}
	Point getLoc() {
		return this.loc;
	}
	
	private char id='u';
	char getID() {
		return id;
	}
	
	public Point move() {
		if(Math.random()<0.5) {
			return super.move();
		}
		else {
			return null;
		}
	}
	public boolean attack(Animal b) {
		return Math.random()<0.5?true:false;
	}
	
	
}
