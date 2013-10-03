import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class TestPythTriangle {
	
	public static void main(String[] args) {
	PythTriangle testPyth = new PythTriangle();
	Triangle testTriag = new Triangle();
	Scanner keyboard = new Scanner(System.in);
	
	int side1, side2, side3;
	System.out.println("Input 3 sides:");
	side1 = keyboard.nextInt();
	side2 = keyboard.nextInt();
	side3 = keyboard.nextInt();
	int[] b = {side1, side2, side3};
	testPyth.setPythSides(b);
	testTriag.setSides(b);
	
	
	
	int x = 0;
	while(x==0){
			
	if(testTriag.isTriangle()==false)
	{
	System.out.println("Input 3 sides again(last value was not a triangle):");
	side1 = keyboard.nextInt();
	side2 = keyboard.nextInt();
	side3 = keyboard.nextInt();
	int[] c = {side1, side2, side3};
	testPyth.setPythSides(c);
	testTriag.setSides(c);

		}
	if(testTriag.isTriangle()==true){
		x=1;
	}
		
	}
	
	
	
	System.out.println("The sides you gave were: " + side1 +" "+ side2+" " + side3);
    if(testPyth.isPythTriangle()==true){
    	System.out.println("It is a Pythagorean Triangle");
    }
    else{
    	System.out.println("It is NOT a Pythagorean Triangle");
    }
	
	
	String fileName = "triangle.txt";
	PrintWriter outputStream = null;
	try{
		outputStream = new PrintWriter(fileName);
	}
	catch(FileNotFoundException e){
		System.out.println("Can't Open.");
		System.exit(0);
	}
	

	outputStream.println(side1);
	outputStream.println(side2);
	outputStream.println(side3);
	outputStream.close();
	
	
	
	
	
	}
}
