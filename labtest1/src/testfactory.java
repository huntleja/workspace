import java.util.Scanner;
public class testfactory {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factory testfactory = new Factory(100, 3);
		
		System.out.println("The automobile factory has " + testfactory.getRobots() + " robots and can produce " +
				testfactory.carProduction() + " cars of " + testfactory.getModels() + " different model types.");
		
		int newrobots;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter the number of robots that will be added:");
		newrobots = keyboard.nextInt();
		
		System.out.println("The factory can produce 3 different models:");
		
		for (int x=1; x<=newrobots;x++){
			testfactory.robots = testfactory.getRobots() + 1;
			System.out.println();
			System.out.println("with " + testfactory.getRobots() + " - " + testfactory.carProduction() + " cars");
			
			
		}
		
		
		
	}
	
	
	
}
