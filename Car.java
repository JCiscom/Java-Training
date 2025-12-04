package exercise1;

public class Car {
	
	private String color;
	private int price;
	private String model;
	private String brand;
	
	public Car() {
		
	}
	public Car(String color, int price, String model, String brand) {
		this.color = color;
		this.price = price;
		this.model = model;
		this.brand = brand;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getPrice() {
		return price;
	}
	
	public String getModel() {
		return model;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void car1() {
		System.out.println("Model: " + model);
		System.out.println("Brand: " + brand);
		System.out.println("Color: " + color);
		System.out.println("Price: " + price);
	}
	
	public void car2() {
		System.out.println();
		System.out.println("Model: " + model);
		System.out.println("Brand: " + brand);
		System.out.println("Color: " + color);
		System.out.println("Price: " + price);
	}
	
}
