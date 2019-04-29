import java.awt.*;
import java.io.*;
import java.util.*;
public class Forest {
	private Board forest = new Board();
	private ArrayList<Animal> animals = new ArrayList<Animal>();
	private ArrayList<Animal> dead = new ArrayList<Animal>();
	
	public static void main(String[] args) throws IOException{
		Forest obj = new Forest();
		obj.start();
	}
	public void start() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		forest.printBoard(animals);
		Printer.printChoices();
		int choice=0;
		try {
			choice=Integer.parseInt(br.readLine());
		}catch (IOException e) {
			System.out.println("ERROR: enter a command");
			start();
		}catch (NumberFormatException e) {
			System.out.println("ERROR: enter a number");
			start();
		}
		if(choice!=0) {
			placeAnimal(choice, randomPoint());
			//forest.printBoard(animals);
			start();
		}
		play();
	}
	public void play() {
		Scanner in=new Scanner(System.in);
		String input;
		forest.printBoard(animals);
		Collections.sort(animals,Animal.NameComparator);
		System.out.println("Press enter to iterate, type 'print' to print the Forest or 'exit' to quit:");
		while(true) {
			input=in.nextLine();
			if (input.equals("print")) {
				forest.printBoard(animals);
			}
			else if(input.equals("exit")) {
				in.close();
				System.exit(0);
			}
			else if(input.equals("check")) {
				int row=in.nextInt();
				int col=in.nextInt();
				Animal f=forest.findAnimal(new Point (row,col), animals);
				if(f!=null) {
					System.out.println(f.getName());
				}
			}
			else if(input.equals("")) {
				moveAnimals();
			}
			Collections.sort(animals,Animal.NameComparator);
		}
	}
	public void moveAnimals() {
		for(Animal a:animals) {
			if(!dead.contains(a)) {
				
				Point oldloc=a.getLoc();
				Point p = a.move();
				try {
				while(!Board.checkInBounds(p)) {
					p = a.move();
				}
				}
				catch(NullPointerException e) {
					Printer.printStayMessage(a, oldloc);
					continue;
				}
				Animal b= forest.findAnimal(p, animals);
				
				if (b==null) {
					if(!p.equals(oldloc)) {
					forest.removeAnimalAt(oldloc);
					forest.addAnimalAt(a, p);
					Printer.printMoveMessage(a, p, oldloc);
					
					a.setLoc(p.x, p.y);
					
					}
					else {
						Printer.printStayMessage(a, p);
					}
				}
				else{
					if(!p.equals(oldloc)) {
					boolean win= a.attack(b);
					if(win) {
						forest.removeAnimalAt(p);
						forest.addAnimalAt(a, p);
						forest.removeAnimalAt(oldloc);
						
						a.setLoc(p.x, p.y);
						b.moveToDead();
						dead.add(b);
						
					}
					else {
						forest.removeAnimalAt(oldloc);
						a.moveToDead();
						dead.add(a);
					}
					Printer.printAttackMessage(a, b, p, a.getLastLoc(), win);
				}
				}
			}
		}
		
	}
	public void placeAnimal(int choice, Point p) {
		switch(choice) {
		case 1:
			Animal d = new Dog(p.x, p.y);
			animals.add(d);
			forest.addAnimalAt(d, p);
			break;
		case 2:
			Animal f = new Fox(p.x, p.y);
			animals.add(f);
			forest.addAnimalAt(f, p);
			break;
		case 3:
			Animal w = new Wolf(p.x, p.y);
			animals.add(w);
			forest.addAnimalAt(w,p);
			break;
		case 4:
			Animal j = new Jaguar(p.x, p.y);
			animals.add(j);
			forest.addAnimalAt(j, p);
			break;
			
		case 5:
			Animal l = new Lion (p.x, p.y);
			animals.add(l);
			forest.addAnimalAt(l, p);
			break;
		case 6:
			Animal c = new Cat (p.x, p.y);
			animals.add(c);
			forest.addAnimalAt(c, p);
			break;
		case 7:
			Animal k = new Kitten(p.x, p.y);
			animals.add(k);
			forest.addAnimalAt(k, p);
			break;
		case 8:
			Animal i = new Dinosaur(p.x, p.y);
			animals.add(i);
			forest.addAnimalAt(i, p);
			break;
		case 9:
			Animal u = new Turtle(p.x, p.y);
			animals.add(u);
			forest.addAnimalAt(u, p);
			break;
		default:
		}
		Printer.printAddMessage(choice, p);
	}
	public Point randomPoint() {
		int x = (int)(Math.random()*Board.dimensions.x);
		int y = (int) (Math.random()*Board.dimensions.y);
		return new Point(x,y);
	}
}
