package exercise2;

public abstract class Vehicle {

	private String brand;
	private int numberOfWheels;
	
	public Vehicle() {

	}
	
	public Vehicle(String brand, int numberOfWheels) {
		this.setBrand(brand);
		this.setNumberOfWheels(numberOfWheels);
	}
	
	abstract void startEngine();
	
	public void destroy() {
		System.out.println( brand + "'s " + numberOfWheels + " wheels" + " was destroyed.");
	}
	
	//getter and setter methods
    public String getBrand() {
  	    return brand;
    }
	public void setBrand(String brand) {
		this.brand = brand;
	}
    public int getNumberOfWheels() {
  	    return numberOfWheels;
    }
	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
}
