package com.stackroute.oops;

public class VehicleService {
	public VehicleService() {
		super();
	}
    /*
    create a Car object and return it
     */
    public Car createCar(String name, String modelName, String type) {
    	Car car = new Car(name, modelName, type);
        return car;
    }

	/*
    create a bike object and return it
     */
    public Bike createBike(String name, String modelName, String type) {
    	Bike bike=new Bike(name, modelName, type);
    	return bike;
    }

    /*
    Method should compare the speed only if the vehicle is of "SPORTS" type.
    Method should return 0 when speeds are equal otherwise should return maximum vehicle speed.
    Method returns -1 if the type is not "SPORTS"
    */
    public int compareMaxSpeed(Vehicle first, Vehicle second) {
        /*
        Vehicle objects should be downcasted to their respective concrete types
        */
    	if (((AbstractManufacturer) first).getType() != "sports" || ((AbstractManufacturer) second).getType()!= "sports") {
    		return -1;
    	}
    	else{
    		if (first.maxSpeed("sports") > second.maxSpeed("sports")) {
    			return first.maxSpeed("sports");
    		}
    		else if (first.maxSpeed("sports") < second.maxSpeed("sports")){
    			return second.maxSpeed("sports");
    		}
    	}
    	
        return 0;
    }
}
