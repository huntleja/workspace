
public class Factory {
public int robots, models, cars;

public Factory (int r, int m){
	robots = r;
	models = m;
}

public int carProduction(){
	cars = 18 * robots/(models*models);
	return cars;
}

public int getRobots(){
	return robots;
}

public int getModels(){
	return models;
}



}
