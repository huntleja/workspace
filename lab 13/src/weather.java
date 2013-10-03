import java.util.Scanner;
public class weather {
	
	
	public static void main(String[] args) {
		
		
		int[] temperature = new int[5];
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to the Average Temperature Program");
		System.out.println("Please enter 5 temperatures:");
		System.out.println("");
		
		
		
		for (int index = 0; index < 5; index++)
		{
			System.out.println("Enter temperature:");
			temperature[index] = keyboard.nextInt();
		}
		
		
		
		System.out.println("Average Temperature:  " + weather.getAverage(temperature));
		
		System.out.println("Temperatures in the Array: ");
		weather.printArray(temperature);


		
		
	}
	public static double getAverage(int temperature[]) {
		double result=0.0;


		for(int i=0; i < temperature.length; i++){
			result=result + temperature[i];
		}


		double average =  result/temperature.length;
		return average;
	}
	
	public static void printArray(int temperature[]) {
	
		for(int i = 0; i < temperature.length; i++){
			System.out.print(temperature[i] + " ");
			}
	
	
	}




}