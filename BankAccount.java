package activity1;

public class BankAccount {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=== Bank Account Name Display ===");
		testCase("ACC-001");
		testCase("ACC-999");
		System.out.println("=== Program Completed Successfully! ===");
	}
	
	public static void testCase (String accountNumber) {
		System.out.println();
		System.out.println("Looking up account: " + accountNumber);
		try {
			String name = getAccountName(accountNumber).toUpperCase();
			System.out.println("Account holder: " + name);
		} catch (NullPointerException e) {
			System.out.println("Error: Account not found!");
		}
		System.out.println();
	}
	
	public static String getAccountName (String accountNumber) {
		if (accountNumber == "ACC-001") {
			return "Juan Dela Cruz";
		} else if (accountNumber == "ACC-002") {
			return "Maria Santos";
		} else {
			return null;
		}
	}
	
}
