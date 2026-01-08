package activity5;

public class AccountValidator {
	public static int testnum = 1;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=== Account Number Validation Test ===\n");
		testValidation("Valid Account", "1234567890");
		testValidation("Too short", "123");
		testValidation("Contains letters", "12345ABC90");
		testValidation("Contains space", "123 4567890");
		testValidation("Null value", null);
		/*
		validateAccountNumber("1234567890");
		validateAccountNumber("123");
		validateAccountNumber("12345ABC90");
		validateAccountNumber("123 4567890");
		validateAccountNumber(null);
		*/
	}
	
	public static void validateAccountNumber(String accountNumber) throws InvalidAccountNumberException{
		if (accountNumber == null) {
			throw new NullPointerException("Error: Account number cannot be null");
		} 
		for (char c : accountNumber.toCharArray()) {
			if (!Character.isDigit(c)) {
				throw new InvalidAccountFormatException("Error: Account number must contain only digits");
			}
		}
		if (accountNumber.length() != 10) {
			throw new InvalidAccountFormatException("Error: Account number must be exactly 10 digits");
		}
		System.out.println("Valid account number: " + accountNumber);
	}
	
	public static void testValidation(String testName, String accountNumber) {
		System.out.println("Test " + testnum + ": " + testName + " (" + accountNumber + ")");
		try {
			validateAccountNumber(accountNumber);
		} catch (InvalidAccountNumberException e) {
			
		} catch (InvalidAccountFormatException e) {
			
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}
		testnum += 1;
		System.out.println();
	}

}
