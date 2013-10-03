import java.io.*;
import java.util.Scanner;
import java.lang.Double;
public class TowerRecords {


	/**
	* @param args
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub


	String fileName="albums.txt";
	
	PrintWriter outputStream = null;
	try
	{
		outputStream = new PrintWriter("newalbums.txt");
	}
	catch(FileNotFoundException e)
	{
		System.out.println("wtd");
	}
	
	Scanner inputStream = null;
	try
	{
		inputStream = new Scanner(new File(fileName));
	}
	catch(FileNotFoundException e)
	{
		System.exit(0);
	}
	
	
		for(int x=1;x<=4;x++)
		{
	
		String album = inputStream.nextLine();
		outputStream.println(album);
		String artist = inputStream.nextLine();
		outputStream.println(artist);
		String year = inputStream.nextLine();
		outputStream.println(year);
		int age = Integer.parseInt(year);
		age = 2010 - age;
		String s1 = inputStream.nextLine();
		String s2 = s1.substring(1);
		double price = Double.parseDouble(s2);
		if(age<1)
			price = price + 0;
		else if (age<5)
			price = price - (price*.05);
		else if (age<10)
			price = price - (price * .10);
		else if (age>=10)
			price = price * .5;
		outputStream.println("$" + price);
		
					
		}
		
		outputStream.close();
		
	}


}