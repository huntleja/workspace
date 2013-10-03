
public class Triangle {
	
	
private int[] sides = new int[3];


	
public Triangle(){
	for (int index=0; index<=2; index++){
		sides[index]=0;
	}
}

public void setSides(int[] a){
	sides = a;
	}

public int[] getSides(){
	return sides;
}

public boolean isTriangle(){
	if (sides[0]+sides[1]<sides[2]||sides[1]+sides[2]<sides[0]||sides[0]+sides[1]<sides[2]){
		return false;
	}
	else if (sides[0]==0||sides[1]==0||sides[2]==0){
		return false;
	}
		else{
			return true;
		}
	}






}


