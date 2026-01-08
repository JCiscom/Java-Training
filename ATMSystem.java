package activity2;

public class ATMSystem {
	public static void main(String[] args) {
		//double[] accounts = {10000, 15000, 20000};
		System.out.println("=== ATM Withdrawal System ===\n");
		System.out.println("--- Test 1: Valid Withdrawal ---");
		processWithdrawal("1", "5000");
		System.out.println("--- Test 2: Invalid Account Index ---");
		processWithdrawal("abc", "5000");
		System.out.println("--- Test 3: Account Not Found ---");
		processWithdrawal("10", "5000");
		System.out.println("--- Test 4: Insufficient Funds ---");
		processWithdrawal("1", "20000");
		System.out.println("=== All tests completed! ===");
	}
	
	public static void processWithdrawal (String accountIndex, String amountInput) {
		double[] accounts = {10000, 15000, 20000};
		try {
			System.out.print("Account=" + accountIndex + ", ");
			System.out.println("Amount=" + amountInput);
			double balance = accounts[Integer.parseInt(accountIndex)];
			System.out.println("Current balance: "+ balance);
			double amount = Double.parseDouble(amountInput);
			System.out.println("Withdrawal: " + amount);
			if (amount > balance) {
				System.out.println("Insufficient funds! Cannot withdraw " + amount);
			} else {
				double newbalance = balance - amount;
				System.out.println("New balance: " + newbalance);
				System.out.println("Withdrawal successful!");
			}
			//System.out.print("Account=" + Integer.parseInt(accountIndex) + ", ");
			//System.out.println("Amount=" + Double.parseDouble(amountInput));
		} catch  (NumberFormatException e) {
			System.out.println("Error: Invalid input");
			System.out.println("Please enter valid numbers.");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Error: Account not found");
			System.out.println("Invalid account index.");
		} catch (Exception e) {
			System.out.println("Transaction failed");
		}
		System.out.println();
	}
}
