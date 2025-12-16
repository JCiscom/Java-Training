package activity3;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class ProductList3 {
	
	public static Scanner input = new Scanner(System.in);
	public static String name;
	public static int price;
	public static int option;
	public static int cheapvalue;
	public static String cheapkey;
	public static int comparevalue;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<String, Integer> productsMap = new HashMap<>();
		
		productsMap.put("Laptop", 45000);
		productsMap.put("Mouse", 2000);
		productsMap.put("Keyboard", 1200);
		productsMap.put("Speaker", 3500);
		productsMap.put("Headset", 1300);
		
		while (option != 5) {
			
			System.out.println("Select an option:");
			System.out.println("1. Search a product.");
			System.out.println("2. Add a product.");
			System.out.println("3. Print all products and prices.");
			System.out.println("4. Find the cheapest product.");
			System.out.println("5. Exit");
			System.out.print("> ");
			option=input.nextInt();
			input.nextLine();
			switch (option) {
			case 1:
		        System.out.print("Enter product name to search: ");
		        name=input.nextLine();
		        
		        if (productsMap.containsKey(name)) {
		        	price = productsMap.get(name);
		        	System.out.println("Product found: " + name + " | Price: " + price);
		        } else {
		        	System.out.println("Product not found.");
		        }
		        System.out.println();
		        break;
			case 2:
				System.out.print("Enter product name to add: ");
				name=input.nextLine();
				System.out.print("Enter price: ");
				price=input.nextInt();
				input.nextLine();
				productsMap.put(name, price);
				System.out.println("Product added: " + name);
				System.out.println();
				break;
			case 3:
				System.out.println("All Products and Prices:");
		        for (Entry<String, Integer> entry : productsMap.entrySet()) {
		            System.out.println(entry.getKey() + " - " + entry.getValue());
		        }
		        System.out.println("Total Unique Products: " + productsMap.size());
		        System.out.println();
		        break;
			case 4:
		        for (Entry<String, Integer> entry : productsMap.entrySet()) {
		            comparevalue = entry.getValue();
		            if (cheapvalue == 0 || comparevalue < cheapvalue) {
		                cheapvalue = comparevalue;
		                cheapkey = entry.getKey();
		            }
		        }
		        System.out.println("Cheapest product: " + cheapkey + " - " + cheapvalue);
		        System.out.println();
		        break;
			case 5:
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