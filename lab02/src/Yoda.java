import java.util.Scanner;
class Yoda {
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a line of text. No punctuation please."); 
		Scanner keyboard = new Scanner(System.in);
		
		String s1, s2, s3, s4, s5, s6;
		s1 = keyboard.next();
		s2 = keyboard.nextLine();
		
		s3 = s2.substring(1,2);
		s3 = s3.toUpperCase();
		s4 = s2.substring(2);
		
		s5 = s1.substring(0,1);
		s5 = s5.toLowerCase();
		s6 = s1.substring(1);
			
		
				
		System.out.println("Yoda has rephrased that line to read:" + s3 + s4 +" " + s5 + s6);
		
	}

}
