public class OffensivePlayer extends FootballPlayer {
	private int totalYards, numberOfTDs;
	public OffensivePlayer(String string, int i, int j, int k, int l) {
		super(string, i, j);
		totalYards = k;
		numberOfTDs = l;
		
	}
	public void setNumberOfTDs(int i) {
		numberOfTDs = i;
			
		}
	public int getNumberOfTDs(){
		return numberOfTDs;
	}
	public void setTotalYards(int i) {
	totalYards = i;
		
	}


	public int getTotalYards() {
		
		return totalYards;
	}
	public void display(){
		super.display();
		System.out.println("Total Yards:  "+ getTotalYards());
		System.out.println("Number Of Touchdowns  "+ getNumberOfTDs());
	}


}