import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Auctionmaker {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String description, date, reserve, name, fileName;
		
		System.out.println("Enter item name:");
		name = keyboard.nextLine();
		System.out.println("Enter item description:");
		description = keyboard.nextLine();
		System.out.println("Enter minimum amount:");
		reserve = keyboard.nextLine();
		System.out.println("Enter end date:");
		date = keyboard.nextLine();
		
		fileName = "AuctionItem.html";
		PrintWriter outputStream = null;
		try{
			outputStream = new PrintWriter(fileName);
		}
		catch(FileNotFoundException e){
			System.out.println("Can't Open.");
			System.exit(0);
		}
		

		outputStream.println("<HTML>");
		outputStream.println("<BODY>");
		outputStream.println(" <H1>"+name+"</H1>");
		outputStream.println("<P>"+description+"</P>");
		outputStream.println("<P>Starting bid is $"+reserve+".</P>");
		outputStream.println("<P>Auction will end on "+date+".</P>");
		outputStream.println("</BODY>");
		outputStream.println("</HTML>");
		outputStream.close();
	}

}
