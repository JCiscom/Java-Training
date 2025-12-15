package activity1;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		
		Scanner input = new Scanner(System.in);
		ArrayList<String> products = new ArrayList<>();
		
		products.add("Laptop");
		products.add("Mouse");
		products.add("Keyboard");
		products.add("Monitor");
		products.add("Printer");
		
		System.out.println("All Products:");
        for (String product : products) {
            System.out.println(product);
        }
		
		
		products.remove("Mouse");
		products.add("Webcam");
		
		System.out.println("After Adding and Removing Products:");
        for (String product : products) {
            System.out.println(product);
        }
        
        System.out.print("Enter product name to search: ");
        name = input.nextLine();
		
        if (products.contains(name)) {
        	System.out.println("Product found: " + name);
        } else {
        	System.out.println("Product not found.");
        }
	}

}
