package com.stackroute.oops;

/* This class defines the blueprint for animal object  */
public class Animal {

    private int id;
    private String name;
    private double averageWeight;
    private int numberOfLegs;

    /*Complete Getter and Setter methods*/

    public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getAverageWeight() {
		return averageWeight;
	}

	public void setAverageWeight(double averageWeight) {
		this.averageWeight = averageWeight;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	@Override
    public boolean equals(Object object) {
		if (this == object) {
            return true;
        }
        if (object == null || getClass() != this.getClass()) {
            return false;
        }
        Animal animal = (Animal) object;
        return this.id == animal.id &&
                this.averageWeight == animal.averageWeight &&
                name.equals(animal.name) && this.numberOfLegs == animal.numberOfLegs;
		
    }

    @Override
    public int hashCode() {
    	return name.hashCode();	
        
    }


    /*This method returns a String containing the animal details in below format
     * Animal{id=xx,name='xxxxx',averageWeight=xx.x numberOfLegs=x} */

    public String getAnimalDetails() {
    	
        String AnimalDetailsPrint = "Animal{id="+ id + ", name='"+name+"', averageWeight="+averageWeight+ ",numberOfLegs="+numberOfLegs+"}";
		return AnimalDetailsPrint;
    }
    
		
	}



