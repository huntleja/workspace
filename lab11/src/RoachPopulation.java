public class RoachPopulation{




private double size;






public RoachPopulation(double s){
		size = s;
	}


public void breed(){
	size = size * 2;
}


public void spray(){
	size = size - (size*.10);
}


public double getSize(){
	return size;
}


public void display(){
	System.out.println(getSize());
}


public static void main (String args[]){
	
RoachPopulation newdemo = new RoachPopulation(10.0);


int x;
for (x=1;x<=8;x++){
	newdemo.breed();
	newdemo.spray();
	newdemo.display();
}
	
	
	
}
}