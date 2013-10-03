import java.util.Scanner;
public class Palindrome {

//Method that determines if String is a palindrome disregarding case.
public static boolean palindrome(String input) {
	input = input.toUpperCase();
    int left  = 0;                 
    int right = input.length() -1;
  
    while (left < right) {        
        if (input.charAt(left) != input.charAt(right)) {
            return false;         
        }
        left++;                    
        right--;                   
    }
  
    return true;                  
}
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String input = "";
		while (!input.equals("n")){
		System.out.println("Input the string that needs to be checked if it is a palindrome");
		System.out.println("(press n to terminate the program):");
	   input = keyboard.nextLine();
	   if (input.equals("n"))
	   	break;
    
		boolean test = palindrome(input);
		if (test==true)
			System.out.println("The entered input is a palindrome!");
		else
			System.out.println("The entered input is NOT a palindrome.");
		
				}
		
		
		System.out.println("Process Palindrome finished");
	}


}