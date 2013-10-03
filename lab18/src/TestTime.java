public class TestTime {

	
	public static void main(String[] args) {
		Time t1 = new Time("00", "15");
		Time t2 = new Time("23", "09");
		System.out.println("Setting time to 00:15 and 23:09");
		System.out.print("Time 1 is ");t1.display();
		System.out.print("Time 2 is ");t2.display();
		
		System.out.println("Adding 30 minutes to both");
		t1.addMinute(30);
		t2.addMinute(30);
		System.out.print("Time 1 is ");t1.display();
		System.out.print("Time 2 is ");t2.display();
		
		
		System.out.println("Converting to 12 hour scale.");
		Time.twelveHour = true;
		System.out.print("Time 1 is ");t1.display();
		System.out.print("Time 2 is ");t2.display();
		
		
		System.out.println("Adding 2 hours");
		t1.addHour(2);
		t2.addHour(2);		
		System.out.print("Time 1 is ");t1.display();
		System.out.print("Time 2 is ");t2.display();
		
		
		System.out.println("Converting back");
		Time.twelveHour = false;
		System.out.print("Time 1 is ");t1.display();
		System.out.print("Time 2 is ");t2.display();
		

		
		
	}

}