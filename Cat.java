
public class Cat extends Feline {
	Cat(int x, int y){
		super(x,y);	
	}
	static final String name="Cat";
	
	String getName() {
		return name;
	}
	static final char ID='c';
	char getID() {
		return ID;
	}
}
