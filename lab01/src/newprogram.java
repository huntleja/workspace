import java.util.Scanner;
public class newprogram {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello out there."); 
		String firstName = "John";
		String lastName = "Huntley";
		char grade = 'A';	
		System.out.println("My first name is " + firstName + " and my last name is " + lastName +
	            " and if I study hard, I will make a(n) " + grade + " in CSCE145!"); 
System.out.println("I will now add two interger values, please enter the two interger values seperated by a space: ");
Scanner keyboard = new Scanner(System.in);
int value1 = keyboard.nextInt();
int value2 = keyboard.nextInt();
int result = value1 + value2;
System.out.println("The result of adding " + value1 + " and " + value2 + " is: " + result);
System.out.println("Goodbye");
	}

}
