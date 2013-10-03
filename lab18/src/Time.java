public class Time {


	private String minute, firsthour;
	private String hour;
	static boolean twelveHour;


	public Time(String h, String m) {
		hour = h;
		minute = m;
		firsthour = h;
		}


	public String getHour() {
		int x = Integer.parseInt(hour);
		if (x==00&&twelveHour==true){
			hour = Integer.toString(12);
			return hour;
		}
	if(twelveHour==true&&x>=12){	
			x = x-12;
			  if(x==0){
				  x=1;
			  }
			hour = Integer.toString(x);
			return hour;
		}
		else{
			return hour;
			}
	}


	public String getMinute() {
		return minute;
	}


	public void setHour(int h) {			
		hour = Integer.toString(h);
	
		}


	


	public void setMinute(int m) {
		
			minute = Integer.toString(m);
		}
	


	public void addHour(int h) {
		int x = Integer.parseInt(hour);
		if (x + h >= 24) {
			x = (x + h) - 24;
			hour = Integer.toString(x);}
			 else {
				x = x+h;
			 hour = Integer.toString(x);
			}

	
			


	}


	public void addMinute(int m) {
		int x = Integer.parseInt(minute);
		if (x + m >= 60) {
			int finalMinute = (x + m) - 60;
			minute = Integer.toString(finalMinute);
			int startHour = Integer.parseInt(hour);
			int finalHour = startHour + 1;
			if (finalHour >= 24) {
				int newHour = finalHour - 24;
				hour = Integer.toString(newHour);
			} else {
				hour = Integer.toString(finalHour);
			}
		} else {
			x = m+x;
			minute = Integer.toString(x);
		}
	}


	public void display() {
		if (twelveHour == true) {
			System.out.println(getHour()+":"+getMinute()+getPeriodDesignator());
			} 
		else {
				System.out.println( getHour() + ":" + getMinute());}
		}
	
	
	public String getPeriodDesignator() {



		int y = Integer.parseInt(firsthour);
		if (y<12){
			return "AM";
			}
		else{
			
			return "PM";
		}
		}
	
	
}
	