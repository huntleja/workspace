public class FootballPlayer {
private String name;
private int gamesPlayed, numberOfInjuries;




public FootballPlayer(String player, int x, int y) {
	name = player;
	gamesPlayed = x;
	numberOfInjuries = y;
}




public void setName(String playerName){
	name = playerName;
	}
public void setGamesPlayed(int x){
	gamesPlayed = x;
}
public void setNumberOfInjuries(int cool){
	numberOfInjuries = cool;
}
public int getNumberOfInjuries(){
	return numberOfInjuries;
}
public int getGamesPlayed(){
	return gamesPlayed;
}
public String getName(){
	return name;
}


public void display() {
	System.out.println("Name: "+ getName());
	System.out.println("Games Played: " + getGamesPlayed());
	System.out.println("Number Of Injuries: " + getNumberOfInjuries());
	
	
}


}