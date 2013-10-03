public class DefensivePlayer extends FootballPlayer {
	private int Tackles, Interceptions;
	public DefensivePlayer(String string, int i, int j, int k, int l) {
		super(string, i, j);
		Tackles = k;
		Interceptions = k;
	}
	
	public void setNumberOfInterceptions(int i) {
		Interceptions = i;
		
	}
	
	public int getNumberOfInterceptions() {
		return Interceptions;
		
	}


	public void setNumberOfTackles(int i) {
		Tackles = i;
		
	}


	public int getNumberOfTackles() {
		
		return Tackles;
	}
	public void display(){
		super.display();
		System.out.println("Number of interceptions:  "+ getNumberOfInterceptions());
		System.out.println("Number of tackles:  "+ getNumberOfTackles());
	}


}