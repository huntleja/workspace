public class QuarterBack extends OffensivePlayer {


	private int Interceptions;
	private double Completionpercent;
	public QuarterBack(String string, int i, int j, int k, int l, int m, double d) {
		super(string, i, j, k, l);
		Interceptions = m;
		Completionpercent = d;
		
	}
	public void setCompetionPercentage(double d) {
		Completionpercent = d;
		
	}
	public double getCompletionPercentage() {
		
		return Completionpercent;
	}
	public void setInterceptionsThrown(int i) {
		Interceptions = i;
		
	}


	public int getInterceptionsThrown() {
		
		return Interceptions;
	}
	public void display(){
		super.display();
		System.out.println("Interceptions Thrown: "+ getInterceptionsThrown());
		System.out.println("Completion Percentage: " + getCompletionPercentage());
		
	}


}