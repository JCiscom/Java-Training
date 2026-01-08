package activity4;

public class AccountValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try {
				validateAccountNumber("1234567890");
				validateAccountNumber("123");
				validateAccountNumber(null);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
	}
	
	public static void validateAccountNumber(String accountNumber) throws Exception {
		try {
			//testNull(accountNumber);
			//testLength(accountNumber);
			if (accountNumber == null) {
				throw new NullPointerException("Error Cannot be null");
			} else if (accountNumber.length() != 10) {
				throw new Exception("Error: Must be 10 digits");
			} else {
				System.out.println("Valid account: " + accountNumber);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
	/*
	static void testNull(String accountNumber) {
		if (accountNumber == null) {
			throw new NullPointerException("invalid - null");
		}
	}
	static void testLength(String accountNumber) throws Exception {
		if (accountNumber.length() != 10) {
			throw new Exception("invalid - too short");
		}
	}
	*/
}
