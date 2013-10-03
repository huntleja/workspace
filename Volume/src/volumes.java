import java.util.Scanner;
public class volumes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I will compute the volume for you, enter the mass then the density seperated by a space: ");
		Scanner keyboard = new Scanner(System.in);
		int value1 = keyboard.nextInt();
		int value2 = keyboard.nextInt();
		int result = value1 / value2;

		System.out.println("The volume with the mass of " + value1 + " and density of " + value2 + " is: " + result);

		System.out.println("Have a nice day");


	}

}
