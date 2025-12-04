package exercise1;

public class Marketplace {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Car carshop1 = new Car();
		carshop1.setColor("Indigo");
		carshop1.setPrice(1450000);
		carshop1.setModel("Nissan");
		carshop1.setBrand("ÏNFINITI");
		Car carshop2 = new Car("Silver", 450000, "Mitsubishi", "OUTLANDER");
		carshop1.car1();
		carshop2.car2();
	}
}
