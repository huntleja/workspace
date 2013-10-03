import java.util.Scanner;
public class Backward {

char[] charsOut = new char[80];

	public static void main(String[] args) {
		
		
		char[] charsOut = new char[80];
		System.out.println("Welcome to the Talking Backward Program");
		System.out.println("Please enter from 1 to 80 characters.");
		System.out.println("");
		Scanner keyboard = new Scanner(System.in);
		
		String s1 = keyboard.nextLine();
		char [] charsIn = s1.toCharArray();
		int len = s1.length();
		
		Backward test = new Backward();
		charsOut = test.reverse(s1,charsIn);
		
		System.out.println("The reverse is: ");
		for(int y = 0; y < len; y++){
			System.out.print(charsOut[y]);
				}
		System.out.println("");
		System.out.println("Goodbye");
		
		
	
		
		
	}
public char[] reverse(String s1, char[] charsIn){
	int len = s1.length();
		for (int j = 0; j < len; j++) {
		charsOut[len - 1 - j] =  charsIn[j];
	}
	return charsOut;
        

	
	
	
		
	
	



}}
	


