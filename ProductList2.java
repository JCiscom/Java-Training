package activity2;

import java.util.HashSet;
import java.util.Scanner;

public class ProductList2 {
	
	public static Scanner input = new Scanner(System.in);
	public static String name;
	public static int option;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<String> products = new HashSet<>();
		
		products.add("Laptop");
		products.add("Mouse");
		products.add("Keyboard");
		
		while (option != 4) {
			
			System.out.println("Select an option:");
			System.out.println("1. Search a product.");
			System.out.println("2. Add a product.");
			System.out.println("3. Print all products and count.");
			System.out.println("4. Exit");
			System.out.print("> ");
			option=input.nextInt();
			input.nextLine();
			switch (option) {
			case 1:
		        System.out.print("Enter product name to search: ");
		        name=input.nextLine();
		        
		        if (products.contains(name)) {
		        	System.out.println("Product found: " + name);
		        } else {
		        	System.out.println("Product not found.");
		        }
		        System.out.println();
		        break;
			case 2:
				System.out.print("Enter product name to add: ");
				name=input.nextLine();
				products.add(name);
				System.out.println("Product added: " + name);
				System.out.println();
				break;
			case 3:
				System.out.println("All Products:");
		        for (String product : products) {
		            System.out.println(product);
		        }
		        System.out.println("Total Unique Products: " + products.size());
			case 4:
				System.out.println();
				break;
	        default:
	            System.out.println("Invalid option! Please try again.\n");
			}
		}
		System.out.println("Exiting...");
		System.exit(0);
	}

}
