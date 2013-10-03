import java.util.Scanner;
public class profanity {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input a line of text with period at the end:");
		 Scanner keyboard = new Scanner(System.in);
		 
		 String s1;
		 s1 = keyboard.nextLine();
		 
		 s1 = s1.toLowerCase();
		 if ((s1.indexOf ("dog ")!=-1) || (s1.indexOf ("llama ")!=-1) || (s1.indexOf ("cat ")!=-1) || (s1.indexOf (" dog ")!=-1) || (s1.indexOf (" cat ")!=-1) || (s1.indexOf (" llama ")!=-1)
		        || (s1.indexOf ("dog.")!=-1) || (s1.indexOf ("cat.")!=-1) || (s1.indexOf ("llama.")!=-1))
		  System.out.println("Profanity found.");
		  
		 else
		  System.out.println("No profanity, all is well.");
		 
		 
		 
	}

}
