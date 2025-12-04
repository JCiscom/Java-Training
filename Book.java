/**
 * 
 */
package Seatwork1;

/**
 * 
 */
public class Book {

	String title;
	String binding;
	public static int price = 340;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book novel = new Book();
		
		novel.title = "1984";
		novel.binding = "paperback";
		System.out.println ("I've bought a book named " + novel.title + " (" + novel.binding + ").");
	    boughtbook();
	}
	
	public static void boughtbook() {
		System.out.println ("Price is: " + price);
	}
	
}
