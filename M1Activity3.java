/**
 * 
 */
package ph.com.bpi.module1;
import java.util.Scanner;
/**
 * 
 */
public class M1Activity3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter first integer: ");
		int num1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int num2 = input.nextInt();
		
		int sum = num1 + num2;
		int diff = num1 - num2;
		int product = num1 * num2;
		
		System.out.println("Sum: " + sum);
		System.out.println("Difference: " + diff);
		System.out.println("Product: " + product);
	}

}
