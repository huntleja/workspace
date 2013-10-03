import java.util.Scanner;
public class atmwithdraw {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount, jackson, hamilton, lincoln, washington;
		System.out.println("Please enter the number of dollars you wish to withdraw:");
		
		Scanner keyboard = new Scanner(System.in);
		amount = keyboard.nextInt();
						
		jackson = amount / 20;
		amount = amount % 20;
		hamilton = amount / 10;
		amount = amount % 10;
		lincoln = amount / 5;
		amount = amount % 5;
		washington = amount;
		
		System.out.println("I will dispense");
		
		System.out.println("	" + jackson + " $20 dollar bill(s)");
		System.out.println("	" + hamilton + " $10 dollar bills(s)");
		System.out.println("	" + lincoln + " $5 dollar bill(s)");
		System.out.println("	" + washington + " $1 dollar bill(s)");
		
		System.out.println("Thank you for your business.");
	}

}
