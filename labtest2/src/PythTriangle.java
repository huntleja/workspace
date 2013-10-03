
public class PythTriangle extends Triangle {

private int [] pythSides = new int[3];

public PythTriangle(){
	super();
	pythSides = super.getSides();
}
public int[] setPythSides(int[] a){
	super.setSides(a);
	pythSides = super.getSides();
	return pythSides;
}

public boolean isPythTriangle(){
	int side1, side2, side3;
	side1=pythSides[0];
	side2=pythSides[1];
	side3=pythSides[2];
	
	if((side1*side1)+(side2*side2)==(side3*side3)){
		return true;
	}
	else{
		return false;
	}
}

}
