package activity6;

public class InsufficientFundsException extends Exception {
	String message;
	double balance;
	double requestedAmount;
	
	public InsufficientFundsException(String message, double balance, double requestedAmount) {
		// TODO Auto-generated constructor stub
		this.message = message;
		this.balance = balance;
		this.requestedAmount = requestedAmount;
	}
	

    public String getMessage() {
        return message;
    }

    public double getBalance() {
        return balance;
    }
    
    public double getrequestedAmount() {
    	return requestedAmount;
    }
    
}
