package exercise2;

public class Truck extends Vehicle implements Refuelable {
	
	public Truck() {
		
	}
	
	public Truck(String brand, int numberOfWheels) {
		this.setBrand(brand);
		this.setNumberOfWheels(numberOfWheels);
	}
	
	@Override
	public void refuel() {
		System.out.println( getBrand() + " refueled.");
	}
	
	@Override
	public void startEngine() {
		System.out.println("Engine starts...");
	}
}