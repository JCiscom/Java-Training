package exercise2;

public class Car extends Vehicle implements Refuelable {
	
	public Car() {
		
	}
	
	public Car(String brand, int numberOfWheels) {
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
