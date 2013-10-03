import java.util.Scanner;
public class favorite {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter favorite color, favorite food, favorite animal, and a friend or relative seperated by a space:");
		Scanner keyboard = new Scanner(System.in);
		String color, food, animal, friend;
		color = keyboard.next();
		food = keyboard.next();
		animal = keyboard.next();
		friend = keyboard.next();
		
		System.out.println("I had a dream that "+friend+" ate a "+color+" "+animal+" and said it tasted like "+food+"!");
		
		
	}

}
