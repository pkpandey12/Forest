import java.awt.*;
import java.util.*;
public class Board {
	static final Point dimensions = new Point (15,15);
	char board[][];
	Board(){
		board = new char[dimensions.x][ dimensions.y];
		for(int i=0; i <dimensions.x; i ++) {
			for (int j=0; j<dimensions.y; j++) {
				board [i][j] = '.';
			}
		}
	}
	Animal findAnimal(Point x, ArrayList<Animal> animals) {
		for(Animal a: animals) {
			if ( a.getLoc().equals(x)) {
				return a;
			}
		}
		return null;
	}
	void printBoard(ArrayList<Animal> animals){
		for(int i=0; i <dimensions.x; i ++) {
			for (int j=0; j<dimensions.y; j++) {
				Animal a =findAnimal(new Point(i,j), animals);
				if(a!=null) {
					System.out.print(a.getID());
				}
				else {
					System.out.print(".");
				}
			}
			System.out.println();
		}
	}
	static boolean checkInBounds(Point a) {
		if (a.x<15 && a.x>=0 && a.y<15 && a.y>=0) {
			
				return true;
			
		}
		else
			return false;
	}
	void addAnimalAt(Animal a, Point p) {
		board[p.x][p.y]=a.getID();
	}
	void removeAnimalAt(Point p) {
		board[p.x][p.y] = '.';
	}
}
