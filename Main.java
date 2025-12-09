package exercise2;

public class Main {

	public static void main(String[] args) {
		
		Car car = new Car("Mitsubishi", 4);
		Truck truck = new Truck("Isuzu", 12);
		
		car.refuel();
		car.startEngine();
		
		truck.refuel();
		truck.startEngine();
		
		destroyVehicle(truck);
		
	}
	
	private static void destroyVehicle(Truck executeDestroy) {
		
		executeDestroy.destroy();
		
	}

}
