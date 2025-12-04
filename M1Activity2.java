/**
 * 
 */
package ph.com.bpi.module1;
import java.util.Scanner;
/**
 * 
 */
public class M1Activity2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your age: ");
		String num = input.nextLine();
		int intnum =  Integer.parseInt(num);
		System.out.println("Your age as int: " + intnum);
		double doublenum = intnum;
		System.out.println("Your age as double: " + doublenum);
	}

}
