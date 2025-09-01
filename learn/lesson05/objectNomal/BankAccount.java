package objectNomal;


public class BankAccount {
	
	private int balance;

	public BankAccount(int balance) {
		this.balance = balance;
		
	}
	
	public void deposit(int amount) {
		balance += amount;
		
	}
	
	public int getBalance() {
		return balance;
	}
	
	public static void main(String[] args) {
		BankAccount account = new BankAccount(1000);
		
		account.deposit(500);
		System.out.println("bot:残高"+ account.getBalance());
	}



}


	
	



