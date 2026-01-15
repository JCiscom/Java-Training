package activity6;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BankAccount {

	private static Logger logger = LoggerFactory.getLogger(BankAccount.class);
	
	public double balance = 10000;
	
	@FunctionalInterface
	interface BankTestOperation {
		void execute() throws InvalidAmountException, InsufficientFundsException;
	}
	
	public void withdraw(double amount) throws InvalidAmountException, InsufficientFundsException {
		logger.info("Withdrawal requested: P{}", amount);
		
		if (amount < 0) {
			logger.error("Invalid deposit amount: P{}", amount);
			throw new InvalidAmountException("Deposit Account must be positive.");	
		}
		
		if (amount > balance) {
			logger.warn("Insufficient funds: P{} available.", balance);
			throw new InsufficientFundsException("Insufficient funds for withdrawal.", balance, amount);
		}
		
		balance -= amount;
		logger.info("Withdrawal completed: P{}, New balance: P{}", amount, balance);
	}
	
	public void deposit(double amount) throws InvalidAmountException {
		logger.info("Deposit requested: P{}", amount);
		
		if (amount <= 0) {
			logger.error("Invalid deposit amount: P{}", amount);
			throw new InvalidAmountException("Deposit Account must be positive.");
		}
		
		if (amount > 50000) {
			logger.warn("Large deposit: P{} - requires verification", amount);
		}
		
		balance += amount;
		logger.info("Deposit completed: P{}, New balance: P{}", amount, balance);
	}
	
	public static void runTest(BankTestOperation operation, String operationName) {
		try {
			operation.execute();
		} catch (InvalidAmountException e) {
			logger.error("Deposit Failed: Deposit amount must be positive.", e);
		} catch (InsufficientFundsException e) {
			logger.error("Withdrawal Failed: Insufficient funds for withdrawal.", e);
		}
	}
	
	public static void main(String[] args) {
		BankAccount account = new BankAccount();
		// TODO Auto-generated method stub
		runTest(() -> account.deposit(5000), "Deposit");
		runTest(() -> account.withdraw(3000), "Withdrawal");
		runTest(() -> account.deposit(-500), "Deposit");
		runTest(() -> account.withdraw(20000), "Withdrawal");
		runTest(() -> account.deposit(60000), "Deposit");
		
	}

}
